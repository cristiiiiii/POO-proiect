public class Main {
    public static void main(String[] args) {

        Pat pat = new Pat(1500);
        Canapea canapea = new Canapea(2500);

        pat.descriereUtilizare();
        System.out.println("Pret pat: " + pat.calculeazaPretFinal());

        canapea.descriereUtilizare();
        System.out.println("Pret canapea: " + canapea.calculeazaPretFinal());
    }
}