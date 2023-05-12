package Capitulo5.Vehiculos;

public abstract class Vehiculo {
    //Atributos
    protected int velocidadActual;
    protected int velocidadMaxima;

    

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }



    @Override
    public String toString() {
        return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
    }



    abstract void acelerar(int velocidad);

    

    abstract void frenar(int velocidad);

    
}
