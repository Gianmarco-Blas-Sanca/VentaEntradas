/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
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
        return false;
    }

    public boolean eliminarZona(String nombre) {
        return false;
    }
}
