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
    

    public Venta() {
        this.entradas = new ArrayList<>();
    }

    public boolean anular() {
       try {
            if (this.monto <= 0) {
                throw new IllegalArgumentException("No se puede anular una venta con un monto menor o igual a cero.");
            }
            if (this.entradas == null || this.entradas.isEmpty()) {
                throw new NullPointerException("No se puede anular una venta que no contiene entradas registradas.");
            }
            
            System.out.println("Venta anulada con éxito.");
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            System.err.println("Error al intentar anular la venta: " + e.getMessage());
            return false;
        }
    }
}
