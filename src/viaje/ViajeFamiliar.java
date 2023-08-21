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
public class ViajeFamiliar extends Viaje {

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechallegada, int familia) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechallegada = fechallegada;
        this.familia=familia;

    }
    private int familia;
//Constructor getters and setters

    public int getFamilia() {
        return familia;
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Metodo implementado en la clase hija viaje familiar";
    }
}
