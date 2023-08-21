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
public class ViajeIncentivo extends Viaje {

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechallegada,String empresa) {
       this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechallegada = fechallegada;
         this.empresa=empresa;
    }

    private String empresa;
//Constructor, getters and setters

    public String getEmpresa() {
       
        return empresa;
    }
    

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    public String cualquierMetodo2() {
        return "Metodo implementado en la clase hija viaje de incentivo";
    }
}
