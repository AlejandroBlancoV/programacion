package Capitulo5.Ejemplo42;

public class ConjuntoCerrado extends Urbana{
    protected double valorArea=2500000;
    protected double valorAdministracion;
    protected double tienePiscina;
    protected boolean tieneCamposDeportivos;


    public ConjuntoCerrado(int idTipo, int area, String direccion, int numHabitaciones, int numBaños, int numPisos,
            double valorArea, double valorAdministracion, double tienePiscina, boolean tieneCamposDeportivos) {
        super(idTipo, area, direccion, numHabitaciones, numBaños, numPisos);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    
}
