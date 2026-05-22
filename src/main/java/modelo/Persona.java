/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasena; 

   public Persona(String nombres, String apellidos, String dni, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getDni() { return dni; }
    public String getContrasena() { return contrasena; }
    public String getNombres() { return nombres; }
}
