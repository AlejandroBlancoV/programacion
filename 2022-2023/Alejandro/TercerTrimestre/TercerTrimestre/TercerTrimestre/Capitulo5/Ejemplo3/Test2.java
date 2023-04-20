package Capitulo5.Ejemplo3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        EstacionServicio vehiculo = new Vehiculo(Color.yellow, (byte) 4, (short) 2500, (byte) 300);

        Motocicleta MotoBarata = new Motocicleta(Color.red, (short) 125, (short) 25);
        EstacionServicio MotoBarata2 = new Motocicleta(Color.red, (short) 125, (short) 25);
        Motocicleta MotoCara = new Motocicleta(Color.yellow, (short) 1000, (short) 90);

        Camion CamionNormal = new Camion(Color.red, (byte) 4,
                (byte) 2, (short) 4000, (short) 300);
        EstacionServicio CamionEnorme = new Camion(Color.red, (byte) 24,
                (byte) 6, (short) 15000, (short) 800);
        EstacionServicio Zito = new Coche(Color.cyan, (byte) 4, (short) 12, (short) 104, 5);


        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        
        lista.add(MotoBarata);
        lista.add(MotoCara);
        lista.add(CamionNormal);

        ArrayList<EstacionServicio> paganos = new ArrayList<EstacionServicio>();
        paganos.add(vehiculo);
        paganos.add(MotoBarata2);
        paganos.add(CamionEnorme);
        paganos.add(Zito);

        for (Vehiculo v : lista) {
            System.out.println(v);
            System.out.println("a pagar: " + v.pagarRodaje());
        }
        Collections.sort(lista);
        for (Vehiculo v : lista) {
            System.out.println(v);
            System.out.println("a pagar: " + v.pagarRodaje());
        }


        
        for (EstacionServicio sp : paganos) {
            System.out.println(sp);
            System.out.println("a pagar: " + sp.pagarCarburante());
        }
}
}
