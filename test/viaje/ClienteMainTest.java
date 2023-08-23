/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package viaje;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ClienteMainTest {
    
    public ClienteMainTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ClienteMain.main(args);
    }

    @Test
    public void testLeerViajes() {
        System.out.println("leerViajes");
        ClienteMain.leerViajes();
    }

    @Test
    public void testMostrarViajes() {
        System.out.println("mostrarViajes");
        ClienteMain.mostrarViajes();
    }
    
}
