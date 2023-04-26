package Capitulo5.Ejemplo42;

public class Casa extends Vivienda {
    protected int numPisos;

    public Casa(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "Casa [numPisos=" + numPisos + "numHabitaciones=" + numHabitaciones + ", numBaños=" + numBaños + "]";
    }


}
