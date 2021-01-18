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
public class OrdineTest {
    
    public OrdineTest() {
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
     * Test of addPiatto method, of class Ordine.
     */
    @Test
    public void testAddPiatto() {
        System.out.println("addPiatto");
        Piatto x = null;
        Ordine instance = null;
        instance.addPiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePiatto method, of class Ordine.
     */
    @Test
    public void testRemovePiatto() {
        System.out.println("removePiatto");
        int x = 0;
        Ordine instance = null;
        instance.removePiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getprezzo method, of class Ordine.
     */
    @Test
    public void testGetprezzo() {
        System.out.println("getprezzo");
        Ordine instance = null;
        double expResult = 0.0;
        double result = instance.getprezzo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Ordine.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Ordine instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
