package Capitulo5.Ejemplo42;

public class Apartamento extends Vivienda{
    protected static double valorArea=2000000;

    
    public Apartamento(int idTipo, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);
        //TODO Auto-generated constructor stub
    }


    @Override
    public String toString() {
        return super.toString()+ "Apartamento []";
    }

    

   
    

}
