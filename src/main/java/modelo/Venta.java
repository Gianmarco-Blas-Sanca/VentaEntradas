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


public class Venta {
    private Date fecha;
    private int monto;
    private Tarjeta tarjeta; 
    private Zona zona;
    private List<Entrada> entradas;
    

    public Venta(Zona zona, List<Entrada> entradas, Tarjeta tarjeta) {
        this.fecha = new Date();
        this.zona = zona;
        this.entradas = entradas;
        this.tarjeta = tarjeta;
        this.monto = zona.getPrecio() * entradas.size();
    }

    public void anular() throws IllegalStateException{
        if (this.entradas == null || this.entradas.isEmpty()) {
            throw new IllegalStateException("No se puede anular una venta sin entradas.");
        }
        for (Entrada e : entradas) {
            e.liberar();
        }
        this.monto = 0;
          
    }
    public int getMonto() { return monto; }
}
