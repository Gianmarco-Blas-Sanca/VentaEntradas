/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */


public class Tarjeta {
    private int numero;
    private String nombre;
    private String fecha;
    private int cvv;

   public Tarjeta(int numero, String nombre, String fecha, int cvv) {
        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cvv = cvv;
    }

    public void validarGarantia() throws IllegalArgumentException {
        if (this.cvv < 100 || this.cvv > 999) {
            throw new IllegalArgumentException("El código CVV es inválido. Debe tener exactamente 3 dígitos.");
        }
        if (this.numero <= 0) {
            throw new IllegalArgumentException("El número de tarjeta es inválido.");
        }
    }
}
