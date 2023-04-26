package Capitulo5.Ejemplo42;

public class LocalComercial extends Local{
    protected double valorArea=3000000;
    protected String centroComercial;
    public LocalComercial(int idTipo, int area, String direccion, double valorArea, String centroComercial) {
        super(idTipo, area, direccion);
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    
}
