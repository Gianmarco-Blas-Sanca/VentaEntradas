/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
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

    // Métodos abstractos dictados por el diagrama UML
    public abstract boolean registrarTarjeta(Tarjeta tarjeta);
    public abstract boolean eliminarTarjeta();
    public abstract boolean anularVenta(Venta venta);
    public abstract boolean comprar();

    // Getters y Setters
    public String getDni() { return dni; }
    public String getContrasena() { return contrasena; }
    public String getNombres() { return nombres; }
}
