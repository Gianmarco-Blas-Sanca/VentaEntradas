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
public class Cliente extends Persona {
    private int puntos;
    
    // Composición: Un cliente tiene una tarjeta (1 a 1)
    private Tarjeta tarjeta;
    // Asociación: Un cliente puede tener múltiples ventas (1 a *)
    private List<Venta> ventas;

    public Cliente() {
        this.ventas = new ArrayList<>();
    }

    public void ingresar(String usuario, String clave) {
        // Lógica de ingreso
    }
}
