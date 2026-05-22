/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
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

    public Zona() {
        this.entradas = new ArrayList<>();
    }

    public boolean generarEntradas() {
        return false;
    }

    public Entrada[] mostrarEntrada() {
        return new Entrada[0];
    }

    public Entrada[] venderEntrada(int numero) {
        try {
            // Validación de límites lógicos
            if (numero <= 0) {
                throw new IllegalArgumentException("El número de entradas a vender debe ser mayor a 0.");
            }
            if (numero > this.capacidad) {
                throw new IllegalArgumentException("El número solicitado excede la capacidad disponible.");
            }
            
            // Lógica simulada de venta
            System.out.println("Vendiendo " + numero + " entradas.");
            return new Entrada[numero];
            
        } catch (IllegalArgumentException e) {
            // Captura del error y retorno de un arreglo vacío por seguridad
            System.err.println("Error procesando la venta: " + e.getMessage());
            return new Entrada[0];
        }
}
}
