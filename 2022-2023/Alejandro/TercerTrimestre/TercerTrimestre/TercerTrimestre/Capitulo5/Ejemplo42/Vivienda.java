package Capitulo5.Ejemplo42;

public class Vivienda extends Inmueble{

    protected int numHabitaciones;
    protected int numBaños;
    
    public Vivienda(int idTipo, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idTipo, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    @Override
    public String toString() {
        return "Vivienda [numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + "idTipo=" + idTipo + ", area=" + area + ", direccion=" + direccion + ", precio=" + precio
        + "]";
    }

    
    
}
