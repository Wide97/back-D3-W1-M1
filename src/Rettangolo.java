public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
                this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase (int base) {
        this.base = base;
    }

    public int gatAltezza () {
        return altezza;
    }

    public void setAltezza (int altezza) {
        this.altezza = altezza;
    }

    public int calcolaPerimetro () {
        return base * altezza;
    }

    public  int calcolaArea () {
        return 2 * (base + altezza);
    }
}


