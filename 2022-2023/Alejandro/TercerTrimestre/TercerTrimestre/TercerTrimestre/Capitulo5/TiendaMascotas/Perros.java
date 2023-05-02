package Capitulo5.TiendaMascotas;

public class Perros extends Mascota{
    protected int peso;
    protected boolean muerde;

    protected static String sonido(){
return "Los perros ladran";
    }

    public Perros(String nombre, int edad, String color, int peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public String toString() {
        return super.toString()+"Perros [peso=" + peso + ", muerde=" + muerde + "]";
    }

    
}
