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
public class IngredienteTest {
    
    public IngredienteTest() {
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
     * Test of getPrezzo method, of class Ingrediente.
     */
    @Test
    public void testGetPrezzo() {
        System.out.println("getPrezzo");
        Ingrediente instance = null;
        double expResult = 0.0;
        double result = instance.getPrezzo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescrizione method, of class Ingrediente.
     */
    @Test
    public void testGetDescrizione() {
        System.out.println("getDescrizione");
        Ingrediente instance = null;
        String expResult = "";
        String result = instance.getDescrizione();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantita method, of class Ingrediente.
     */
    @Test
    public void testGetQuantita() {
        System.out.println("getQuantita");
        Ingrediente instance = null;
        int expResult = 0;
        int result = instance.getQuantita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescrizione method, of class Ingrediente.
     */
    @Test
    public void testSetDescrizione() {
        System.out.println("setDescrizione");
        String Descrizione = "";
        Ingrediente instance = null;
        instance.setDescrizione(Descrizione);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantita method, of class Ingrediente.
     */
    @Test
    public void testSetQuantita() {
        System.out.println("setQuantita");
        int quantita = 0;
        Ingrediente instance = null;
        instance.setQuantita(quantita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrezzo method, of class Ingrediente.
     */
    @Test
    public void testSetPrezzo() {
        System.out.println("setPrezzo");
        double prezzo = 0.0;
        Ingrediente instance = null;
        instance.setPrezzo(prezzo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
