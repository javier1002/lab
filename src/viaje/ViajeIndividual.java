/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viaje;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ViajeIndividual extends Viaje {

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechallegada) {
       this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechallegada = fechallegada;
    }
// Constructor
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
//No se sobreescribe cualquierMetodo2 ()
}

