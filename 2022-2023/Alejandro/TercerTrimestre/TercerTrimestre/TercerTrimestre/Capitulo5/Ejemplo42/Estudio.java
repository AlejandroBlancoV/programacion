package Capitulo5.Ejemplo42;

public class Estudio extends Apartamento{
    protected static double valorArea=1500000;

    public Estudio(int idTipo, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idTipo, area, direccion, 1,2);
        
    }

    @Override
    public String toString() {
        return super.toString()+ "Estudio []";
    }

    
}
