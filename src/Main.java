public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7, 12);
        Rettangolo rettangolo1 = new Rettangolo(8, 9);

        System.out.println("area :" + rettangolo.calcolaArea());
        System.out.println("perimetro :" + rettangolo.calcolaPerimetro());

        rettangolo.setAltezza(6);
        rettangolo.setBase(3);

        System.out.println("nuova area :" + rettangolo.calcolaArea());
        System.out.println("nuovo perimetro : " + rettangolo.calcolaPerimetro());

        stampaAreaEPerimetro(rettangolo);
        stampaAreaEPerimetro(rettangolo1);
        stampaSommaAreaPerimetro(rettangolo, rettangolo1);

        Sim sim1 = new Sim("123456789");
        sim1.stampaInformazioni();

        sim1.aggiungiChiamata("234567891", 5);
        sim1.aggiungiChiamata("345678912", 7);

        sim1.stampaInformazioni();

        Sim sim2 = new Sim("567891234", 10 );
        sim2.stampaInformazioni();
    }
    public static void stampaAreaEPerimetro (Rettangolo rettangolo) {
        int area = rettangolo.calcolaArea();
        int perimetro = rettangolo.calcolaPerimetro();

        System.out.println("Area del rettangolo" + area);
        System.out.println("Perimetro del rettangolo " + perimetro);
    }

    public static void stampaSommaAreaPerimetro (Rettangolo r, Rettangolo r1) {
        int sommaAree = r.calcolaArea() + r1.calcolaArea();
        int sommaPerimetri = r.calcolaPerimetro() + r1.calcolaPerimetro();

        System.out.println("Somma delle aree : " + sommaAree);
        System.out.println("Somma dei perimetri : " + sommaPerimetri);
    }



}