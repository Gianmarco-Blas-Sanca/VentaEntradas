/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import excepciones.VentaExcepcion;
import java.util.List;

public class ControladorVentas {
    private Concierto conciertoActual;

    public ControladorVentas(Concierto concierto) {
        this.conciertoActual = concierto;
    }

    public Venta procesarCompra(Cliente cliente, String nombreZona, int cantidad, Tarjeta tarjeta) throws VentaExcepcion {
        try {
            // 1. Validaciones previas
            tarjeta.validarGarantia();
            cliente.registrarTarjeta(tarjeta);

            // 2. Localizar recursos
            Zona zonaSeleccionada = conciertoActual.buscarZona(nombreZona);

            // 3. Ejecutar transacción
            List<Entrada> entradasCompradas = zonaSeleccionada.venderEntrada(cantidad);

            // 4. Consolidar la venta
            Venta nuevaVenta = new Venta(zonaSeleccionada, entradasCompradas, tarjeta);
            cliente.agregarVenta(nuevaVenta);

            return nuevaVenta; // Se devuelve la venta en lugar de imprimir

        } catch (IllegalArgumentException | IllegalStateException e) {
            // Captura errores de validación de datos o de estado y los sube a la capa superior
            throw new VentaExcepcion(e.getMessage());
        } catch (Exception e) {
            throw new VentaExcepcion("Error crítico del sistema: " + e.getMessage());
        }
    }
}