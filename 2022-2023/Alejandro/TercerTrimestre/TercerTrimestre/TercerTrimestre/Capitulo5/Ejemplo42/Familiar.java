package Capitulo5.Ejemplo42;

public class Familiar extends Apartamento{
    protected double valorArea=2000000;
    protected int valorAdministracion;


    public Familiar(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, double valorArea,
            int valorAdministracion) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
    }

    
}
