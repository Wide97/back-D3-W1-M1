public class Sim {
    private String telefono;
    private int credito;
    private Chiamata[] lista;

    public Sim ( String telefono, int credito) {
        this.telefono = telefono;
        this.credito = credito;
        this.lista = new Chiamata[5];
    }

    public Sim (String telefono) {
        this.telefono = telefono;
        this.credito = 0;
        this.lista = new Chiamata[5];
    }

    public void aggiungiChiamata(String numeroTelefono, int durata) {
        System.arraycopy(lista, 1, lista, 0, lista.length - 1);
        lista[lista.length - 1] = new Chiamata(numeroTelefono, durata);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCredito () {
        return credito;
    }

    public void  setCredito ( int credito) {
        this.credito = credito;
    }

    public Chiamata[] getLista() {
        return lista;
    }

    public void  ricarica (int importo) {
        this.credito += importo;
        System.out.println(" Credito aggiornato : " + credito);
    }

    public void stampaInformazioni () {
        System.out.println("Numero di telefono: " + telefono);
        System.out.println("Credito attuale: " + credito);
        System.out.println("Ultime chiamate: " );
        for (Chiamata chiamata : lista) {
            if (chiamata != null) {
                System.out.println(chiamata);
            }
        }
    }
}


