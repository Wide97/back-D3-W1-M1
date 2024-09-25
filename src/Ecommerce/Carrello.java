package Ecommerce;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private int totaleCosto;

    public Carrello (Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new Articolo[10];
        this.totaleCosto = 0;
    }

    public Cliente getCliente( ) {
        return cliente;
    }

    public  Articolo[] getArticoli () {
        return articoli;
    }

    public  int getTotaleCosto () {
        return totaleCosto;
    }

    public void aggiungiArticolo (Articolo articolo, int quantità) {
        if (articolo.getPezziDisponibili() >= quantità) {
            for (int i=0; i<articoli.length; i++) {
                if (articoli[i] == null) {
                    articoli[i] = articolo;
                    articolo.setPezziDisponibili(articolo.getPezziDisponibili() - quantità);
                    totaleCosto += articolo.getPrezzo() * quantità;
                    System.out.println("Aggiunto al carrello: " + articolo + "x" + quantità);
                    break;
                }
            }
        } else {
            System.out.println("Articolo non disponibile in quantità richiesta");
        }
    }

    public void stampaCarrello () {
        System.out.println("Carrello di " + cliente.getNome() + "" + cliente.getCognome() + ":");
        for (Articolo articolo : articoli) {
            if (articolo != null) {
                System.out.println(articolo);
            }
        }
        System.out.println("Totale costo: " +totaleCosto + "eur");
    }

}


