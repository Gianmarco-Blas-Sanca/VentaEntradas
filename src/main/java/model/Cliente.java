/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private int puntos;
    
    
    private Tarjeta tarjeta;
    
    private List<Venta> ventas;

    public Cliente() {
        this.ventas = new ArrayList<>();
    }

    public void ingresar(String usuario, String clave) {
        
    }
}
