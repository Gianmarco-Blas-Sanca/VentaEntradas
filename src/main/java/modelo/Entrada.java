/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Entrada {
    private int numero;
    private String estado;
    
    public Entrada(int numero) {
        this.numero = numero;
        this.estado = "DISPONIBLE";
    }

    public void vender() throws IllegalStateException {
        if ("VENDIDA".equals(this.estado)) {
            throw new IllegalStateException("La entrada " + numero + " ya está vendida.");
        }
        this.estado = "VENDIDA";
    }

    public void liberar() {
        this.estado = "DISPONIBLE";
    }
    
    public String getEstado() { return estado; }
}
