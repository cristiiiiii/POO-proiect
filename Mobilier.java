
public abstract class Mobilier {

    private int id;
    private String producator;
    private String material;
    private double pret;

    // Constructor fara argumente
    public Mobilier() {
        this.id = 0;
        this.producator = "";
        this.material = "";
        this.pret = 0;
    }

    // Constructor cu toate argumentele
    public Mobilier(int id, String producator, String material, double pret) {
        this.id = id;
        this.producator = producator;
        this.material = material;
        this.pret = pret;
    }

    // Constructor de copiere
    public Mobilier(Mobilier m) {
        this.id = m.id;
        this.producator = m.producator;
        this.material = m.material;
        this.pret = m.pret;
    }

    // Getteri si setteri
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Producator: " + producator +
               ", Material: " + material +
               ", Pret: " + pret;
    }

    // Metode abstracte de la punctul 1
    public abstract double calculeazaPretFinal();

    public abstract void descriereUtilizare();
}

