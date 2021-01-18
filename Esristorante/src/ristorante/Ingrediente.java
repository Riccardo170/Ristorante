package ristorante;

import java.util.logging.Logger;


public class Ingrediente 
{
    private String Descrizione;
    private int quantita;
    private double prezzo;

    public Ingrediente(String Descrizione, int quantita, double prezzo) 
    {
        this.Descrizione = Descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    public double getPrezzo() 
    {
        return prezzo;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setDescrizione(String Descrizione) {
        this.Descrizione = Descrizione;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
  
    
}
