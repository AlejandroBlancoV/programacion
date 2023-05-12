package Capitulo5.Vehiculos;

public class Test {
    public static void main(String[] args) {
        Terrestre camioneta= new Terrestre(100, 250);
        System.out.println(camioneta.toString());

        Acuatico motoAcuatica= new Acuatico(40, 110);
        System.out.println(motoAcuatica.toString());
        System.out.println("Revoluciones del motor: "+motoAcuatica.calcularRevolucionesMotor(1200, 2));

        camioneta.acelerar(50);
        System.out.println(camioneta.toString());


        motoAcuatica.recomendarVelocidad(20);
        System.out.println(motoAcuatica.toString());

    }
}
