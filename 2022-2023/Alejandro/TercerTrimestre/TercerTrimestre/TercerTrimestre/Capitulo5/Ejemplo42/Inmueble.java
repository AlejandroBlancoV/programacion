package Capitulo5.Ejemplo42;

public class Inmueble {
    protected int idTipo;
    protected int area;
    protected String direccion;
    protected double precio;
    protected double precioventa;


   

    public Inmueble(int idTipo, int area, String direccion) {
        this.idTipo = idTipo;
        this.area = area;
        this.direccion = direccion;
    }




    public double calculaPrecioVenta(double valorArea){
        precioventa=area*valorArea;
        return precioventa;
    }




    @Override
    public String toString() {
        return super.toString()+ "Inmueble [idTipo=" + idTipo + ", area=" + area + ", direccion=" + direccion + ", precio=" + precio
                + "]";
    }




    
    
    
}
