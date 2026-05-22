/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import controlador.ControladorVentas;
import modelo.Cliente;
import modelo.Concierto;
import modelo.Tarjeta;
import modelo.Zona;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class VistaConsola {
    private ControladorVentas controlador;
    private Concierto conciertoActual;
    private Scanner scanner;
    private Cliente clienteSesion; // Simula la sesión del usuario

    // Constructor que inyecta las dependencias del Controlador y el Modelo
    public VistaConsola(ControladorVentas controlador, Concierto concierto) {
        this.controlador = controlador;
        this.conciertoActual = concierto;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n--- SISTEMA DE VENTAS - ANIVERSARIO UNMSM ---");
            System.out.println("1. Iniciar sesión como Cliente (Demo)");
            System.out.println("2. Ver zonas disponibles");
            System.out.println("3. Comprar entradas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    simularInicioSesion();
                    break;
                case "2":
                    mostrarZonas();
                    break;
                case "3":
                    flujoCompra();
                    break;
                case "4":
                    ejecutando = false;
                    System.out.println("Cerrando el sistema...");
                    break;
                default:
                    System.err.println("Opción no reconocida. Intente de nuevo.");
            }
        }
    }

    private void simularInicioSesion() {
        // Para simplificar la prueba del MVC, creamos un cliente temporal en memoria
        this.clienteSesion = new Cliente("Gianmarco", "Blas", "12345678", "clave123");
        System.out.println("Sesión iniciada exitosamente para: " + clienteSesion.getDni());
    }

    private void mostrarZonas() {
        System.out.println("\n--- ZONAS DEL CONCIERTO ---");
        // El try-catch aquí maneja posibles errores de puntero si el concierto no tiene zonas inicializadas
        try {
            System.out.println("Concierto: " + conciertoActual.getNombre()); // Falta getter en modelo, asumiendo su creación
            // Nota: Debes asegurarte de añadir el método getZonas() en tu clase Concierto.java
            // for (Zona z : conciertoActual.getZonas()) {
            //     System.out.println("- " + z.getNombre() + " | Precio: S/" + z.getPrecio());
            // }
            System.out.println("(Implementar iteración de zonas mediante getZonas() en Concierto.java)");
        } catch (Exception e) {
            System.err.println("No se pudieron cargar las zonas: " + e.getMessage());
        }
    }

    private void flujoCompra() {
        if (clienteSesion == null) {
            System.err.println("Acceso denegado: Debe iniciar sesión primero.");
            return;
        }

        System.out.println("\n--- PROCESO DE COMPRA ---");
        try {
            // 1. Captura de datos de la zona y entradas
            System.out.print("Ingrese el nombre exacto de la Zona (ej. VIP, General): ");
            String nombreZona = scanner.nextLine();

            System.out.print("Ingrese la cantidad de entradas (Máximo 4): ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            // 2. Captura de datos de la tarjeta obligatoria
            System.out.println("--- Ingrese los datos de su tarjeta bancaria ---");
            System.out.print("Número de tarjeta: ");
            int numTarjeta = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Nombre del titular: ");
            String titular = scanner.nextLine();
            
            System.out.print("Fecha de vencimiento (MM/AA): ");
            String fecha = scanner.nextLine();
            
            System.out.print("CVV (3 dígitos): ");
            int cvv = Integer.parseInt(scanner.nextLine());

            Tarjeta tarjetaCliente = new Tarjeta(numTarjeta, titular, fecha, cvv);

            // 3. Delegación al Controlador
            // La vista no decide si la venta es válida, solo pasa los datos al controlador.
            controlador.procesarCompra(clienteSesion, nombreZona, cantidad, tarjetaCliente);

        } catch (NumberFormatException e) {
            // Captura errores si el usuario escribe texto en lugar de números
            System.err.println("Error de formato: Asegúrese de ingresar valores numéricos válidos en Cantidad, Tarjeta y CVV.");
        }
    }
}
