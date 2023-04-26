package Capitulo5.Ejemplo42;

public class Local extends Inmueble{

    public Local(int idTipo, int area, String direccion) {
        super(idTipo, area, direccion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Local [idTipo=" + idTipo + ", area=" + area + ", direccion=" + direccion + ", precio=" + precio
        + "]";
    }
    
    
}
