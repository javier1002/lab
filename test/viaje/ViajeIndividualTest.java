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
public class ViajeIndividualTest {
    
    public ViajeIndividualTest() {
    }

    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeIndividual instance = new ViajeIndividual(" origen", " destino",   100, new Date(), new Date());
        String expResult = "Disfruta tu viaje individual";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }
    
}
