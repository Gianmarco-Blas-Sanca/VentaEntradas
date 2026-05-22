/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private List<Entrada> entradas;

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new ArrayList<>();
        generarEntradas();
    }

    private void generarEntradas() {
        for (int i = 1; i <= capacidad; i++) {
            entradas.add(new Entrada(i));
        }
    }

    public List<Entrada> venderEntrada(int cantidad) throws IllegalArgumentException, IllegalStateException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El número de entradas a vender debe ser mayor a 0.");
        }
        if (cantidad > 4) {
            throw new IllegalArgumentException("Regla de negocio: Una venta no puede exceder las 4 entradas.");
        }

        List<Entrada> entradasDisponibles = new ArrayList<>();
        for (Entrada e : entradas) {
            if ("DISPONIBLE".equals(e.getEstado())) {
                entradasDisponibles.add(e);
                if (entradasDisponibles.size() == cantidad) break;
            }
        }

        if (entradasDisponibles.size() < cantidad) {
            throw new IllegalStateException("Capacidad insuficiente. Solo quedan " + entradasDisponibles.size() + " entradas disponibles.");
        }

        for (Entrada e : entradasDisponibles) {
            e.vender(); // Cambia el estado de la entrada
        }

        this.capacidad -= cantidad;
        return entradasDisponibles;
    }

    public String getNombre() { return nombre; }
    public int getPrecio() { return precio; }
}
