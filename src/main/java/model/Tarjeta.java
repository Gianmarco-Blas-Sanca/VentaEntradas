/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */


public class Tarjeta {
    private int numero;
    private String nombre;
    private String fecha;
    private int CVV;

    public void validarGarantia() {
        try {
            // El CVV estándar debe estar en el rango de 100 a 999 
            if (this.CVV < 100 || this.CVV > 999) {
                throw new IllegalArgumentException("El código de seguridad CVV es inválido. Debe tener exactamente 3 dígitos.");
            }
            System.out.println("Tarjeta validada de forma segura.");
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción de seguridad en Tarjeta: " + e.getMessage());
        }
    }
}
