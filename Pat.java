
public class Pat extends Mobilier {

    private double lungime;
    private double latime;
    private String tipSaltea;

    // Constructor fara argumente
    public Pat() {
        super();
        lungime = 0;
        latime = 0;
        tipSaltea = "";
    }

    // Constructor cu toate argumentele
    public Pat(int id, String producator, String material,
               double pret, double lungime, double latime,
               String tipSaltea) {
        super(id, producator, material, pret);
        this.lungime = lungime;
        this.latime = latime;
        this.tipSaltea = tipSaltea;
    }

    // Constructor de copiere
    public Pat(Pat p) {
        super(p);
        this.lungime = p.lungime;
        this.latime = p.latime;
        this.tipSaltea = p.tipSaltea;
    }

    // Getteri si setteri
    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public String getTipSaltea() {
        return tipSaltea;
    }

    public void setTipSaltea(String tipSaltea) {
        this.tipSaltea = tipSaltea;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Lungime: " + lungime +
               ", Latime: " + latime +
               ", Tip saltea: " + tipSaltea;
    }

    @Override
    public double calculeazaPretFinal() {
        return getPret();
    }

    @Override
    public void descriereUtilizare() {
        System.out.println("Patul este folosit pentru dormit.");
    }
}
