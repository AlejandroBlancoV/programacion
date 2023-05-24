package Capitulo5.Ejemplo83;

public class Piramide extends Figurageometrica{
    private double altura;
    private double base;
    private double apotema;
    public Piramide(double altura, double base, double apotema) {
        this.altura = altura;
        this.base = base;
        this.apotema= apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen(){
        double volumen= (Math.pow(base, 2.0)* altura)/3.0;
        return volumen;
    }
    public double calcularSuperficie(){
        double areaBase= Math.pow(base, 2.0);
        double arealado= 2.0 * base* apotema;
        return areaBase+ arealado;
    }

    @Override
    public String toString() {
        return "Piramide [altura=" + altura + ", base=" + base + ", apotema=" + apotema + "]";
    }

    
}
