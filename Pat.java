public class Pat extends Mobilier {

    private double pret;

    public Pat(double pret) {
        this.pret = pret;
    }

    @Override
    public double calculeazaPretFinal() {
        return pret;
    }

    @Override
    public void descriereUtilizare() {
        System.out.println("Patul este folosit pentru dormit.");
    }
}