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

    public Concierto(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.zonas = new ArrayList<>();
    }

    public void agregarZona(Zona zona) {
        if (zona == null) {
            throw new NullPointerException("La zona no puede ser nula.");
        }
        this.zonas.add(zona);
    }

    public Zona buscarZona(String nombreZona) throws IllegalArgumentException {
        for (Zona z : zonas) {
            if (z.getNombre().equalsIgnoreCase(nombreZona)) {
                return z;
            }
        }
        throw new IllegalArgumentException("La zona especificada no existe.");
    }
    public String getNombre() { return nombre; }
    public List<Zona> getZonas() { return zonas; }
}
