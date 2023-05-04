package Capitulo5.TiendaMascotas;

public class GatoPeloCorto extends Gatos{
    enum razas{
       AZUL_RUSO, BRITANICO,MANX_Y_DEVON_REX
    }
    
    private  razas raza;

    public GatoPeloCorto(String nombre, int edad, String color, float alturaSalto, float longitudSalto, razas raza) {
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
        return super.toString()+"GatoPeloCorto [raza=" + raza + "]";
    }


    
}
