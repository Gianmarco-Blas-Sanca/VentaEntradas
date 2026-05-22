/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasena; 

    public boolean registrarTarjeta() {
        try {
            if (this.dni == null || this.dni.trim().isEmpty()) {
                throw new IllegalStateException("No se puede registrar una tarjeta sin un DNI asociado.");
            }
            System.out.println("Tarjeta registrada correctamente.");
            return true;
        } catch (IllegalStateException e) {
            System.err.println("Error en Persona (registrarTarjeta): " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarTarjeta() {
        return false;
    }

    public boolean anularVenta() {
        return false;
    }

    public boolean comprar() {
        try {
            if (this.contrasena == null || this.contrasena.isEmpty()) {
                throw new IllegalStateException("Operación denegada: El usuario no tiene una contraseña establecida.");
            }
            System.out.println("Compra procesada con éxito.");
            return true;
        } catch (IllegalStateException e) {
            System.err.println("Error en Persona (comprar): " + e.getMessage());
            return false;
        }
    }
}
