package Capitulo5.Ejemplo83;

public class Figurageometrica {
    private double volumen;
    private double superficie;
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    @Override
    public String toString() {
        return "Figurageometrica [volumen=" + volumen + ", superficie=" + superficie + "]";
    }

    

}
