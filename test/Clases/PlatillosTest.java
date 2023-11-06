/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jimhb
 */
public class PlatillosTest {
    
    public PlatillosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombrePlatillo method, of class Platillos.
     */
    @Test
    public void testGetNombrePlatillo() {
        System.out.println("getNombrePlatillo");
        Platillos instance = null;
        String expResult = "";
        String result = instance.getNombrePlatillo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombrePlatillo method, of class Platillos.
     */
    @Test
    public void testSetNombrePlatillo() {
        System.out.println("setNombrePlatillo");
        String nombrePlatillo = "";
        Platillos instance = null;
        instance.setNombrePlatillo(nombrePlatillo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Platillos.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Platillos instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Platillos.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Platillos instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Platillos.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Platillos instance = null;
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Platillos.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Platillos instance = null;
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
