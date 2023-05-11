package Capitulo5.Ejemplo49;

public class Pediatra extends Medico{

    enum tipos{
        NEUROLOGO, PSICOLOGO;
    }
       
    private tipos tipologia;

    public tipos getTipologia() {
        return tipologia;
    }

    public void setTipologia(tipos tipologia) {
        this.tipologia = tipologia;
    }

    public Pediatra(String nombre, tipos tipologia) {
        super(nombre);
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return super.toString()+"Pediatra [tipologia=" + tipologia + "]";
    }

    
    
}
