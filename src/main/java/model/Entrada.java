/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Entrada {
    private int numero;
    private String estado;

    public boolean vender() {
        try {
            // Validación de estado lógico
            if ("VENDIDA".equals(this.estado)) {
                throw new IllegalStateException("La operación no es válida: la entrada ya está vendida.");
            }
            
            // Lógica de venta
            this.estado = "VENDIDA";
            System.out.println("Entrada " + this.numero + " vendida con éxito.");
            return true;
            
        } catch (IllegalStateException e) {
            // Captura del error de estado
            System.err.println("Excepción capturada al vender: " + e.getMessage());
            return false;
        }
    }

    public boolean liberar() {
        return false;
    }
}
