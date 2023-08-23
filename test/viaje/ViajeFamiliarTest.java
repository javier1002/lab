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
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }

    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        ViajeFamiliar instance = new ViajeFamiliar("origen", "destino",  100, new Date(), new Date(), 5);;
        int expResult = 0;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
    }

    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeFamiliar instance = new ViajeFamiliar("origen", "destino",  100, new Date(), new Date(), 5);;
        String expResult = "Viaje para disfrutar con toda tu familia";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = new ViajeFamiliar("origen", "destino",  100, new Date(), new Date(), 5);;
        String expResult = "Metodo implementado en la clase hija viaje familiar";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }
    
}
