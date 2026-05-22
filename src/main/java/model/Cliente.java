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
    
    
    private Tarjeta tarjeta;
    
    private List<Venta> ventas;

    public Cliente() {
        this.ventas = new ArrayList<>();
    }

    public void ingresar(String usuario, String clave) {
        try {
            // Validación de parámetros de entrada
            if (usuario == null || usuario.trim().isEmpty() || clave == null || clave.trim().isEmpty()) {
                throw new IllegalArgumentException("El usuario y la clave no pueden estar vacíos.");
            }
            // Lógica de ingreso 
            System.out.println("Ingreso exitoso para el usuario: " + usuario);
            
        } catch (IllegalArgumentException e) {
            // Manejo de la excepción capturada
            System.err.println("Error de validación al ingresar: " + e.getMessage());
        }
    }
}
