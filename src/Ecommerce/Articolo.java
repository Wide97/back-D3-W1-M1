package Ecommerce;

public class Articolo {
    private String codice;
    private String descrizione;
    private int prezzo;
    private int pezziDisponibili;

    public Articolo (String codice, String descrizione, int prezzo, int pezziDisponibili){
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public String getCodice () {
        return codice;
    }

    public String getDescrizione () {
        return descrizione;
    }

    public  int getPrezzo () {
        return prezzo;
    }

    public int getPezziDisponibili () {
        return pezziDisponibili;
    }

    public void setPezziDisponibili (int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }

    public String toString() {
        return "Articolo: " + descrizione + "(Codice: " + codice + "), prezzo: " + prezzo +"eur, Disponibili: " + pezziDisponibili;
    }
}


