/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import java.util.Vector;

/**
 *
 * @author Utente
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String s;
        Double incasso=0.0, max=0.0;
        int maxin=0;
        int numero=1;
        String tipo="primo";
        Vector<Piatto> elencopertipo = new Vector<Piatto>();
        
      
        Ingrediente i1 = new Ingrediente("Ragu", 1, 2); 
        Ingrediente i2 = new Ingrediente("Pasta", 1, 2);
        Ingrediente i3 = new Ingrediente("Olio", 1, 0.3);
        Ingrediente i4 = new Ingrediente("Sale", 1, 0.2);
      
        Ingrediente i5 = new Ingrediente("Pesto", 1, 3); 
        
        
        Piatto p1= new Piatto("Pasta al ragu","Primo");
        p1.AggiuntaIngredientte(i1);
        p1.AggiuntaIngredientte(i2);
        p1.AggiuntaIngredientte(i3);
        p1.AggiuntaIngredientte(i4);
        
        p1.AggiuntaIngredientte(i4);
        p1.RimozioneIngredientte(i4);
     
        Piatto p2= new Piatto("Pasta al pesto","Secondo");
        p2.AggiuntaIngredientte(i5);
        p2.AggiuntaIngredientte(i2);
        p2.AggiuntaIngredientte(i3);
        p2.AggiuntaIngredientte(i4);
        
        
        Ristorante r1=new Ristorante();
        r1.AggiuntaPiatto(p1);
        r1.AggiuntaPiatto(p2);
        
        r1.AggiuntaPiatto(p1);
        r1.RimozionePiatto(p1);
        
         
        Ordine o1 = new Ordine(numero,"Luca");
        numero++;
        o1.addPiatto(p1);
        r1.AggiuntaOrdine(o1);
        
       
        Ordine o2 = new Ordine(numero,"Lucia");
        numero++;
        o2.addPiatto(p2);
        r1.AggiuntaOrdine(o2);
        
     
        incasso=r1.incassoGiornaliero();
        System.out.println(incasso);
        
   
        maxin=r1.importomax();
        System.out.println("ordine con importo maggiore è: "+maxin);
        
        
        elencopertipo=r1.tipopiatti("Primo");
        for(int i=0;i<elencopertipo.size();i++)
        {
            System.out.println(elencopertipo.get(i).toString());
        
        }
        
        for(int i=0;i<r1.getSizemenu();i++)
        {
            s=r1.toString(i);
            System.out.println();
        }
    }
    
}
