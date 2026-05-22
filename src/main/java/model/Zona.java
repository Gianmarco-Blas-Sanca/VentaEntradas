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
            //Validación de la regla de negocio (máximo 4)
            if (numero > 4) {
                throw new IllegalArgumentException("Regla de negocio: Una venta no puede exceder las 4 entradas.");
            }
            if (numero > this.capacidad) {
                throw new IllegalArgumentException("El número solicitado excede la capacidad disponible de la zona.");
            }
            
            this.capacidad -= numero; 
            
            System.out.println("Vendiendo " + numero + " entradas. Capacidad restante: " + this.capacidad);
            return new Entrada[numero];
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error procesando la venta: " + e.getMessage());
            return new Entrada[0];
        }
}
}
