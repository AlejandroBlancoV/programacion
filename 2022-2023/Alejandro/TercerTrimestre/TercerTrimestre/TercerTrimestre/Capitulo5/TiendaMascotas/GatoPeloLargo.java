package Capitulo5.TiendaMascotas;

public class GatoPeloLargo extends Gatos{

        enum razas{
        ANGORA, MALAYO, BALINES, SOMALI
    }
    
    private  razas raza;


    
    public GatoPeloLargo(String nombre, int edad, String color, float alturaSalto, float longitudSalto, razas raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }



    @Override
    public String toString() {
        return super.toString()+"GatoPeloLargo [raza=" + raza + "]";
    }

    
}
