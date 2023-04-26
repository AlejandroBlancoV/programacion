package Capitulo5.Ejemplo42;

public class Independiente extends Urbana{

    protected double valorArea=3000000;

    public Independiente(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, int numPisos,
            double valorArea) {
        super(idTipo, area, direccion, numHabitaciones, numBaños, numPisos);
        this.valorArea = valorArea;
    }


    
}
