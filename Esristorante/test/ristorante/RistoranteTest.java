/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import java.util.Vector;
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
public class RistoranteTest {
    
    public RistoranteTest() {
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
     * Test of tipopiatti method, of class Ristorante.
     */
    @Test
    public void testTipopiatti() {
        System.out.println("tipopiatti");
        String tipopiatto = "";
        Ristorante instance = new Ristorante();
        Vector<Piatto> expResult = null;
        Vector<Piatto> result = instance.tipopiatti(tipopiatto);
        assertEquals(expResult, result);

    }

    /**
     * Test of AggiuntaPiatto method, of class Ristorante.
     */
    @Test
    public void testAggiuntaPiatto() {
        System.out.println("AggiuntaPiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(x);
     
       
    }

    /**
     * Test of RimozionePiatto method, of class Ristorante.
     */
    @Test
    public void testRimozionePiatto() {
        System.out.println("RimozionePiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.RimozionePiatto(x);
     
    }

    /**
     * Test of importomax method, of class Ristorante.
     */
    @Test
    public void testImportomax() {
        System.out.println("importomax");
        Ristorante instance = new Ristorante();
        int expResult = 0;
        int result = instance.importomax();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of incassoGiornaliero method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornaliero() {
        System.out.println("incassoGiornaliero");
        Ristorante instance = new Ristorante();
        double expResult = 0.0;
        double result = instance.incassoGiornaliero();
        assertEquals(expResult, result, 0.0);
      
    }

 

    /**
     * Test of AggiuntaOrdine method, of class Ristorante.
     */
    @Test
    public void testAggiuntaOrdine() {
        System.out.println("AggiuntaOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaOrdine(x);
       
    }

    /**
     * Test of RimozioneOrdine method, of class Ristorante.
     */
    @Test
    public void testRimozioneOrdine() {
        System.out.println("RimozioneOrdine");
        int x = 0;
        Ristorante instance = new Ristorante();
        instance.RimozioneOrdine(x);
     
    }

    /**
     * Test of getSizemenu method, of class Ristorante.
     */
    @Test
    public void testGetSizemenu() {
        System.out.println("getSizemenu");
        Ristorante instance = new Ristorante();
        int expResult = 0;
        int result = instance.getSizemenu();
        assertEquals(expResult, result);
        
    }
    
}
