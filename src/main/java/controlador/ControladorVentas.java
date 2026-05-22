/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.*;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class ControladorVentas {
    private Concierto conciertoActual;

    public ControladorVentas(Concierto concierto) {
        this.conciertoActual = concierto;
    }

    public void procesarCompra(Cliente cliente, String nombreZona, int cantidad, Tarjeta tarjeta) {
        // AQUÍ ES DONDE DEBE IR EL TRY-CATCH
        try {
            // 1. Validaciones previas
            tarjeta.validarGarantia();
            cliente.registrarTarjeta(tarjeta);

            // 2. Localizar recursos
            Zona zonaSeleccionada = conciertoActual.buscarZona(nombreZona);

            // 3. Ejecutar transacción en el modelo (lanzará error si supera 4 o no hay aforo)
            List<Entrada> entradasCompradas = zonaSeleccionada.venderEntrada(cantidad);

            // 4. Consolidar la venta
            Venta nuevaVenta = new Venta(zonaSeleccionada, entradasCompradas, tarjeta);
            cliente.agregarVenta(nuevaVenta);

            System.out.println(">>> ÉXITO: Venta procesada. Total pagado: S/ " + nuevaVenta.getMonto());

        } catch (IllegalArgumentException e) {
            // Captura errores de validación de datos (tarjeta mala, más de 4 entradas)
            System.err.println(">>> ERROR DE DATOS: " + e.getMessage());
            
        } catch (IllegalStateException e) {
            // Captura errores de estado del sistema (capacidad llena)
            System.err.println(">>> ERROR DE NEGOCIO: " + e.getMessage());
            
        } catch (Exception e) {
            // Intercepta cualquier fallo crítico no contemplado
            System.err.println(">>> ERROR CRÍTICO DEL SISTEMA: " + e.getMessage());
        }
    }
}
