
package ristorante;

import java.util.Vector;


public class Ristorante {
    
    private Vector<Piatto> menu;
    private Vector<Ordine> ordin;
    
    public Ristorante(){
        menu = new Vector<Piatto>();
        ordin = new Vector<Ordine>();
    }
    
    public Vector<Piatto> tipopiatti(String tipopiatto){
        Vector<Piatto> ordinetipo;
        ordinetipo = new Vector<Piatto>();
        for(int i=0;i<menu.size();i++)
        {
            if(menu.get(i).getTipo().equals(tipopiatto))
            {
                ordinetipo.addElement(menu.get(i));
            }
        }
        
        return ordinetipo;
    }
    
    public void AggiuntaPiatto(Piatto x)
    {
        menu.addElement(x);
    }
    public void RimozionePiatto(Piatto x)
    {
        menu.removeElement(x);
    }
    
    public int importomax()
    {
        double in=0.0;
        int v=0;
        Ordine o=new Ordine(0,"");
        for(int j=0;j<ordin.size();j++)
        {
            o=ordin.get(j);
            
            if(in<o.getprezzo())
            {
                in=o.getprezzo();
                v=j;
            }
            }
        
        return v;
    }
    
    public double incassoGiornaliero()
    {
        double in=0.0;
        Ordine o=new Ordine(0,"");
        for(int j=0;j<ordin.size();j++)
        {
            o=ordin.get(j);
            for(int i=0;i<o.getSize();i++)
            {
                in+=o.getprezzo();
            }
        }
        return in;
    }

 
    
    public void AggiuntaOrdine(Ordine x)
    {
        ordin.addElement(x);
    }
    public void RimozioneOrdine(int x)
    {
        ordin.removeElementAt(x);
    }
    
    public int getSizemenu()
    {
        return menu.size();
    }
    
}
