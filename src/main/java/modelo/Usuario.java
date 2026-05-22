/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Usuario extends Persona {
    private boolean estado;

    public Usuario(String nombres, String apellidos, String dni, String contrasena, boolean estado) {
        super(nombres, apellidos, dni, contrasena);
        this.estado = estado;
    }

    public void validarPermisos() throws IllegalStateException {
        if (!this.estado) {
            throw new IllegalStateException("El usuario se encuentra inactivo. No tiene permisos en el sistema.");
        }
    }
    }

