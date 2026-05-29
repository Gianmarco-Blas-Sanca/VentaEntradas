/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Usuario extends Persona {
    private boolean estado;

    public Usuario(String nombres, String apellidos, String dni, String contrasena, boolean estado) {
        super(nombres, apellidos, dni, contrasena);
        this.estado = estado;
    }

    public void registrarZonas() {
        // Lógica para que el admin registre zonas (espacio para futura implementación)
    }

    // Implementación de métodos abstractos
    @Override
    public boolean registrarTarjeta(Tarjeta tarjeta) {
        return false; // Los administradores no asocian tarjeta para uso del sistema
    }

    @Override
    public boolean eliminarTarjeta() {
        return false;
    }

    @Override
    public boolean anularVenta(Venta venta) {
        if (this.estado) {
            venta.anular(); // El admin sí tiene poder para anular ventas de terceros
            return true;
        }
        return false;
    }

    @Override
    public boolean comprar() {
        return false; // Los administradores no compran
    }

    public void validarPermisos() throws IllegalStateException {
        if (!this.estado) {
            throw new IllegalStateException("El usuario se encuentra inactivo. No tiene permisos.");
        }
    }
}

