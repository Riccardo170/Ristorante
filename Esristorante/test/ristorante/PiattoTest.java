/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utente
 */
public class PiattoTest {
    
    public PiattoTest() {
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
     * Test of AggiuntaIngredientte method, of class Piatto.
     */
    @Test
    public void testAggiuntaIngredientte() {
        System.out.println("AggiuntaIngredientte");
        Ingrediente x = null;
        Piatto instance = null;
        instance.AggiuntaIngredientte(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RimozioneIngredientte method, of class Piatto.
     */
    @Test
    public void testRimozioneIngredientte() {
        System.out.println("RimozioneIngredientte");
        Ingrediente x = null;
        Piatto instance = null;
        instance.RimozioneIngredientte(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPre method, of class Piatto.
     */
    @Test
    public void testGetPre() {
        System.out.println("getPre");
        Piatto instance = null;
        double expResult = 0.0;
        double result = instance.getPre();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Piatto.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Piatto instance = null;
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Piatto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Piatto instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Piatto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Piatto instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
