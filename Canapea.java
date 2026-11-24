
public class Canapea extends Mobilier {

    private int numarLocuri;
    private boolean extensibila;
    private String culoare;

    // Constructor fara argumente
    public Canapea() {
        super();
        numarLocuri = 0;
        extensibila = false;
        culoare = "";
    }

    // Constructor cu toate argumentele
    public Canapea(int id, String producator, String material,
                   double pret, int numarLocuri,
                   boolean extensibila, String culoare) {
        super(id, producator, material, pret);
        this.numarLocuri = numarLocuri;
        this.extensibila = extensibila;
        this.culoare = culoare;
    }

    // Constructor de copiere
    public Canapea(Canapea c) {
        super(c);
        this.numarLocuri = c.numarLocuri;
        this.extensibila = c.extensibila;
        this.culoare = c.culoare;
    }

    // Getteri si setteri
    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public boolean getExtensibila() {
        return extensibila;
    }

    public void setExtensibila(boolean extensibila) {
        this.extensibila = extensibila;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Numar locuri: " + numarLocuri +
               ", Extensibila: " + extensibila +
               ", Culoare: " + culoare;
    }

    @Override
    public double calculeazaPretFinal() {
        return getPret();
    }

    @Override
    public void descriereUtilizare() {
        System.out.println("Canapeaua este folosita pentru relaxare.");
    }
}
