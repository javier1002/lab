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
        Viaje instance = new ViajeImpl();
        String expResult = "";
        String result = instance.descripcion();
        assertEquals(expResult, result,0);
        fail();
    }

    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = new ViajeImpl();
        String expResult = "";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        Viaje instance = new ViajeImpl();
        String expResult = "";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Viaje instance = new ViajeImpl();
        String expResult = "";
        String result = instance.getOrigen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Viaje instance = new ViajeImpl();
        String expResult = "";
        String result = instance.getDestino();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Viaje instance = new ViajeImpl();
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result,0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaSalida() {
        System.out.println("getFechaSalida");
        Viaje instance = new ViajeImpl();
        Date expResult = null;
        Date result = instance.getFechaSalida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechallegada() {
        System.out.println("getFechallegada");
        Viaje instance = new ViajeImpl();
        Date expResult = null;
        Date result = instance.getFechallegada();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String origen = "";
        Viaje instance = new ViajeImpl();
        instance.setOrigen(origen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Viaje instance = new ViajeImpl();
        instance.setDestino(destino);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Viaje instance = new ViajeImpl();
        instance.setCosto(costo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        Date fechaSalida = null;
        Viaje instance = new ViajeImpl();
        instance.setFechaSalida(fechaSalida);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechallegada() {
        System.out.println("setFechallegada");
        Date fechallegada = null;
        Viaje instance = new ViajeImpl();
        instance.setFechallegada(fechallegada);
        fail("The test case is a prototype.");
    }

    public class ViajeImpl extends Viaje {

        public String descripcion() {
            return "";
        }
    }
    
}
