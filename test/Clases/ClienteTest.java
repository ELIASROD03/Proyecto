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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = null;
        String expResult = "Elias";
        String result = instance.getNombre();
        assertEquals(expResult, "Elias");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroTel method, of class Cliente.
     */
    @Test
public void testGetNumeroTel() {
    System.out.println("getNumeroTel");
    Cliente instance = new Cliente("Elias", "92384", "Carne molida");
    String expResult = "92384";
    String result = instance.getNumeroTel();
    assertEquals(expResult, result);
}

    /**
     * Test of setNumeroTel method, of class Cliente.
     */
    @Test
    public void testSetNumeroTel() {
        System.out.println("setNumeroTel");
        String numeroTel = "";
        Cliente instance = null;
        instance.setNumeroTel(numeroTel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
