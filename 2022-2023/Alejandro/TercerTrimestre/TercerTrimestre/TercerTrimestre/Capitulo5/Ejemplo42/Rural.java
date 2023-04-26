package Capitulo5.Ejemplo42;



public class Rural extends Casa{
    protected double valorArea=1500000;
    protected int distanciaCarrera;
    protected int altitud;

    public Rural(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, int numPisos,
            double valorArea, int distanciaCarrera, int altitud) {
        super(idTipo, area, direccion, numHabitaciones, numBaños, numPisos);
        this.valorArea = valorArea;
        this.distanciaCarrera = distanciaCarrera;
        this.altitud = altitud;
    }

    

}
