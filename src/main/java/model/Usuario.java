/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Usuario extends Persona {
    private boolean estado;

    public void registrarZonas() {
        
        try {
            // Si el estado es falso (inactivo), lanzamos una excepción de estado ilegal
            if (!this.estado) {
                throw new IllegalStateException("El usuario se encuentra inactivo. No tiene permisos para registrar zonas.");
            }
            System.out.println("Zonas registradas en el sistema correctamente.");
        } catch (IllegalStateException e) {
            System.err.println("Error de permisos en Usuario: " + e.getMessage());
        }
    }
    }

