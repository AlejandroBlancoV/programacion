package Capitulo5.Ejemplo42;


public class Local extends Inmueble{
    enum tipo{INTERNO,CALLE};
protected tipo tipoLocal;
    public Local(int idTipo, int area, String direccion,  tipo tipoLocal) {
        super(idTipo, area, direccion);
        this.tipoLocal=tipoLocal;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString()+ "Local []";
    }

    
    
    
}
