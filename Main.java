
public class Main {
    public static void main(String[] args) {

        // Constructor fara argumente
        Pat pat1 = new Pat();
        pat1.setId(1);
        pat1.setProducator("IKEA");
        pat1.setMaterial("Lemn");
        pat1.setPret(1500);
        pat1.setLungime(200);
        pat1.setLatime(160);
        pat1.setTipSaltea("Ortopedica");

        // Constructor cu toate argumentele
        Canapea canapea1 = new Canapea(
            2, "Mobexpert", "Textil",
            2500, 3, true, "Gri"
        );

        // Constructori de copiere
        Pat pat2 = new Pat(pat1);
        Canapea canapea2 = new Canapea(canapea1);

        // Afisare cu toString()
        System.out.println("PAT:");
        System.out.println(pat1);

        System.out.println("\nCANAPEA:");
        System.out.println(canapea1);

        // Testare constructori de copiere
        System.out.println("\nCOPIE PAT:");
        System.out.println(pat2);

        System.out.println("\nCOPIE CANAPEA:");
        System.out.println(canapea2);

        // Testare getteri si metode abstracte
        System.out.println("\nPret pat: " + pat1.getPret());
        System.out.println("Pret canapea: " + canapea1.getPret());

        pat1.descriereUtilizare();
        canapea1.descriereUtilizare();
    }
}
