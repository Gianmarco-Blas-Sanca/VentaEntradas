/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import controlador.ControladorVentas;
import modelo.Concierto;
import modelo.Zona;
import vista.VistaConsola;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        
        // 1. Construcción del Modelo Base (Sustituye a una Base de Datos)
        Concierto conciertoUNMSM = new Concierto("Concierto Aniversario San Marcos", new Date());
        
        // Generamos las 4 zonas exigidas por los requisitos
        conciertoUNMSM.agregarZona(new Zona("VIP", 100, 300));
        conciertoUNMSM.agregarZona(new Zona("Preferencial", 200, 200));
        conciertoUNMSM.agregarZona(new Zona("General", 500, 100));
        conciertoUNMSM.agregarZona(new Zona("Tribuna", 300, 50));

        // 2. Instanciación del Controlador
        // Se le inyecta la referencia del concierto para que pueda buscar zonas y validar reglas.
        ControladorVentas controlador = new ControladorVentas(conciertoUNMSM);

        // 3. Instanciación e inicio de la Vista
        // Se inyecta el controlador para canalizar las peticiones del usuario.
        VistaConsola vista = new VistaConsola(controlador, conciertoUNMSM);
        
        // Arranca el bucle del menú principal
        vista.iniciar();
    }
}
