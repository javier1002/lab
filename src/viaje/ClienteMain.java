/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viaje;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList; 

/**
 *
 * @author Usuario
 */
public class ClienteMain {

      public static List<Viaje> viajes = new ArrayList<>();

    public static void main(String[] args) {

        leerViajes();
        mostrarViajes();
    }

    public static void leerViajes() {
        try {
            Viaje viaje1 = new ViajeFamiliar("Popayan", "Bogota", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"),5);
            viajes.add(viaje1);
            Viaje viaje2 = new ViajeIncentivo("Popayan", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Entel");
            viajes.add(viaje2);
            Viaje viaje3 = new ViajeIndividual("Popayan", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);
            Viaje viaje4 = new ViajeTodoIncluido("Popayan", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void mostrarViajes() {
// implementen ese método.
        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());

            System.out.println("Fecha salida:" + viaje.getFechaSalida());
            System.out.println("Fecha llegada:" + viaje.getFechallegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Desccipcion:" + viaje.descripcion());
            System.out.println("Cualquier metodo: " + viaje.cualquierMetodo());
            System.out.println("Cualquier metodo2:" + viaje.cualquierMetodo2());
            System.out.println("");

        }
    }

}
