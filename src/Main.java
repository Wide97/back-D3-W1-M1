public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7, 12);

        System.out.println("area :" + rettangolo.calcolaArea());
        System.out.println("perimetro :" + rettangolo.calcolaPerimetro());

        rettangolo.setAltezza(23);
        rettangolo.setBase(43);

        System.out.println("nuova area :" + rettangolo.calcolaArea());
        System.out.println("nuovo perimetro : " + rettangolo.calcolaPerimetro());
    }
}