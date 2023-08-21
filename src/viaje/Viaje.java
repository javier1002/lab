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
public abstract class Viaje {

    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechallegada;
// Constructores, getters y setters

    public abstract String descripcion();

    public String cualquierMetodo() {

        return "Cualquier metodo implementado en la clase base";
    }

    public String cualquierMetodo2() {
        return "Cualquier metodo2 implementado en la clase base";
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getCosto() {
        return costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechallegada() {
        return fechallegada;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechallegada(Date fechallegada) {
        this.fechallegada = fechallegada;
    }

}
  
