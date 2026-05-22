/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Concierto {
    private String nombre;
    private Date fecha;
    
    private List<Zona> zonas;

    public Concierto() {
        this.zonas = new ArrayList<>();
    }

    public boolean agregarZona(String nombre) {
        try {
            // Validación para evitar NullPointerException
            if (nombre == null) {
                throw new NullPointerException("El nombre de la zona no puede ser nulo.");
            }
            // Lógica simulada para agregar la zona
            System.out.println("Zona agregada: " + nombre);
            return true;
            
        } catch (NullPointerException e) {
            // Se atrapa la excepción y se retorna false para indicar fallo
            System.err.println("Excepción capturada: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarZona(String nombre) {
        return false;
    }
}
