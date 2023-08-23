/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package viaje;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ViajeTest {
    
    public ViajeTest() {
    }

    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Disfruta tu viaje individual"; 
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = new ViajeImpl();
        String expResult = "Cualquier metodo implementado en la clase base";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
    }

    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        Viaje instance = new ViajeImpl();
        String expResult = "Cualquier metodo2 implementado en la clase base";;
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Origen";
        String result = instance.getOrigen();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Destino";
        String result = instance.getDestino();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        int expResult = 100;
        int result = instance.getCosto();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFechaSalida() {
        System.out.println("getFechaSalida");
        Viaje instance =  new ViajeIndividual("Origen", "Destino", 100, null, new Date());
        Date expResult = null;
        Date result = instance.getFechaSalida();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFechallegada() {
        System.out.println("getFechallegada");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), null);
        Date expResult = null;
        Date result = instance.getFechallegada();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String origen = "dsd";
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        instance.setOrigen(origen);
    }

    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        instance.setDestino(destino);
    }

    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Viaje instance = new ViajeImpl();
        instance.setCosto(costo);
    }

    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        Date fechaSalida = null;
        Viaje instance = new ViajeImpl();
        instance.setFechaSalida(fechaSalida);
    }

    @Test
    public void testSetFechallegada() {
        System.out.println("setFechallegada");
        Date fechallegada = null;
        Viaje instance = new ViajeImpl();
        instance.setFechallegada(fechallegada);
    }

    public class ViajeImpl extends Viaje {

        public String descripcion() {
            return "";
        }
    }
    
}
