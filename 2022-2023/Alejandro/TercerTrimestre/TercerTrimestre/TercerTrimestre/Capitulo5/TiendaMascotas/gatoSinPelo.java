package Capitulo5.TiendaMascotas;

public class GatoSinPelo extends Gatos{
    enum razas{
        ESFINGE, ELFO, DONSKOY
    }
    
    private  razas raza;

    public GatoSinPelo(String nombre, int edad, String color, float alturaSalto, float longitudSalto, razas raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    public razas getRaza() {
        return raza;
    }

    public void setRaza(razas raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString()+"gatoSinPelo [raza=" + raza + "]";
    }

    

}
