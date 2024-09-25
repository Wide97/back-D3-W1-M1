public class Chiamata {
    private String numeroTelefono;
    private int durata;

    public Chiamata (String numeroTelefono, int durata) {
        this.numeroTelefono = numeroTelefono;
        this.durata = durata;
    }

    public String getNumeroTelefono () {
        return  numeroTelefono;
    }

    public int getDurata () {
        return durata;
    }

    public String toString () {
        return "Numero : " + numeroTelefono + ", della durata di: " + durata + "min";
    }
}
