package Capitulo5.Vehiculos;

public class Terrestre extends Vehiculo implements Motor{

    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        //TODO Auto-generated constructor stub
    }

    @Override
     void acelerar(int incremento) {
        int vel= velocidadActual+incremento;
        if(vel>velocidadMaxima){
            System.out.println("Supera la velocidad maxima permitida");
        }
        else{
            velocidadActual=vel;
        }
    }

    @Override
    void frenar(int incremento) {
    int vel= velocidadActual-incremento;
    if(vel<0){
        System.out.println("la velocidad no puede ser negativa");
    }
    else{
        velocidadActual=vel;
    }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return(fuerza*radio);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
