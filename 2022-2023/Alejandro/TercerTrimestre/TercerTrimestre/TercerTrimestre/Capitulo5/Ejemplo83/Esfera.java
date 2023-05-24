package Capitulo5.Ejemplo83;

public class Esfera extends Figurageometrica{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());

    }

    public double calcularVolumen(){
        double volumen= 1.333* Math.PI* Math.pow(this.radio, 3.0);
        return volumen;
    }

    public double calcularSuperficie(){
        double superficie= 4.0* Math.PI* Math.pow(this.radio, 2.0);
        return superficie;
    }

    @Override
    public String toString() {
        return "Esfera [radio=" + radio + "]";
    }
    
    
}
