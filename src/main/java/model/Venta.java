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


public class Venta {
    private Date fecha;
    private int monto;
    
    
    private List<Entrada> entradas;

    public Venta() {
        this.entradas = new ArrayList<>();
    }

    public boolean anular() {
        return false;
    }
}
