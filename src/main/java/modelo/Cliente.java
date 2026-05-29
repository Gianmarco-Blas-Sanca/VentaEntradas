/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.List;
import java.util.ArrayList;

public class Cliente extends Persona {
    private int puntos;
    private Tarjeta tarjeta;
    private List<Venta> ventas;

    public Cliente(String nombres, String apellidos, String dni, String contrasena) {
        super(nombres, apellidos, dni, contrasena);
        this.ventas = new ArrayList<>();
        this.puntos = 0;
    }

    // Implementación de métodos abstractos
    @Override
    public boolean registrarTarjeta(Tarjeta tarjeta) throws IllegalArgumentException {
        if (this.dni == null || this.dni.trim().isEmpty()) {
            throw new IllegalArgumentException("No se puede registrar una tarjeta sin un DNI asociado.");
        }
        this.tarjeta = tarjeta;
        return true;
    }

    @Override
    public boolean eliminarTarjeta() {
        if (this.tarjeta != null) {
            this.tarjeta = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean anularVenta(Venta venta) {
        if (ventas.contains(venta)) {
            venta.anular();
            return true;
        }
        return false;
    }

    @Override
    public boolean comprar() {
        return this.tarjeta != null; 
    }

    public void ingresar(String usuario, String clave) throws SecurityException {
        if (usuario == null || usuario.trim().isEmpty() || clave == null || clave.trim().isEmpty()) {
            throw new IllegalArgumentException("El usuario y la clave no pueden estar vacíos.");
        }
        if (!this.dni.equals(usuario) || !this.contrasena.equals(clave)) {
            throw new SecurityException("Credenciales incorrectas.");
        }
    }
    
    public Tarjeta getTarjeta() { return tarjeta; }
    public void agregarVenta(Venta venta) { this.ventas.add(venta); }
}
