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
public class ViajeIncentivoTest {
    
    public ViajeIncentivoTest() {
    }

    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        ViajeIncentivo instance = new ViajeIncentivo(" origen", " destino",   100, new Date(), new Date());
        String expResult = instance.getEmpresa();
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        var instance = new ViajeIncentivo("origen", "destino",   100, new Date(), new Date());
        String expResult = "Viaje incentivo que te envia la empresa " + instance.getEmpresa();
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeIncentivo instance = new ViajeIncentivo(" origen", " destino",   100, new Date(), new Date());;
        String expResult = "Metodo implementado en la clase hija viaje de incentivo";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }
    
}
