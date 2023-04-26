package Capitulo5.Ejemplo42;

public class Estudio extends Apartamento{
    protected double valorArea=1500000;

    public Estudio(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, double valorArea) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);
        this.valorArea = valorArea;
    }

    
}
