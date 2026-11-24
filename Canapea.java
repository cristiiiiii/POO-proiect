public class Canapea extends Mobilier {

    private double pret;

    public Canapea(double pret) {
        this.pret = pret;
    }

    @Override
    public double calculeazaPretFinal() {
        return pret;
    }

    @Override
    public void descriereUtilizare() {
        System.out.println("Canapeaua este folosita pentru relaxare.");
    }
}