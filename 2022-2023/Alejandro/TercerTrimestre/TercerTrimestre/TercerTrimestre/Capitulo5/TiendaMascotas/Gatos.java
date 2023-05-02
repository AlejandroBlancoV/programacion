package Capitulo5.TiendaMascotas;

public class Gatos extends Mascota{
    protected float alturaSalto;
    protected float longitudSalto;


    protected static String sonido(){
        return "Los gatos maullan y ronronean";
    }

    
    public Gatos(String nombre, int edad, String color, float alturaSalto, float longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }
    public float getAlturaSalto() {
        return alturaSalto;
    }
    public void setAlturaSalto(float alturaSalto) {
        this.alturaSalto = alturaSalto;
    }
    public float getLongitudSalto() {
        return longitudSalto;
    }
    public void setLongitudSalto(float longitudSalto) {
        this.longitudSalto = longitudSalto;
    }
    @Override
    public String toString() {
        return super.toString()+"Gatos [alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto + "]";
    }



    
}
