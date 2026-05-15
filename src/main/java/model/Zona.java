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
    
    // Composición: Una zona contiene múltiples entradas (1 a *)
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
        return new Entrada[0];
}
}
