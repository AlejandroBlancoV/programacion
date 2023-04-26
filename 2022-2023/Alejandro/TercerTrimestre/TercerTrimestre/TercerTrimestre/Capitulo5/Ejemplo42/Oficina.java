package Capitulo5.Ejemplo42;

public class Oficina extends Local{
    protected double valorArea=3500000;
    protected boolean esGobierno;


    public Oficina(int idTipo, int area, String direccion, double valorArea, boolean esGobierno) {
        super(idTipo, area, direccion);
        this.valorArea = valorArea;
        this.esGobierno = esGobierno;
    }

    

}
