package Capitulo5.TiendaMascotas;

import java.util.ArrayList;

import Capitulo5.TiendaMascotas.PerroPequeño.razas;

public class Test {
    public static void main(String[] args) {
        ArrayList<Mascota> lista= new ArrayList<Mascota>();
        Mascota anxo= new Mascota("Anxo", 13, "Ocre");
        Perros max= new Perros("Max", 11, "blanco", 17, true);
        Gatos simba= new Gatos("simba", 10, "anaranjao", 2, 3);
        PerroPequeño pisable= new PerroPequeño("messi", 15, "amarillo", 1, true, razas.CHIHUAHUA);
        PerroMediano changui= new PerroMediano("changui", 18, "negro", 12, false, PerroMediano.razas.DALMATA);
        PerroGrande Rex= new PerroGrande("bob", 3, "marron", 22, false, PerroGrande.razas.PASTOR_ALEMAN);
        GatoPeloCorto misifu= new GatoPeloCorto("misifu", 5, "blanco", 1, 2, GatoPeloCorto.razas.BRITANICO);
        GatoPeloLargo pelanas= new GatoPeloLargo("chispas", 1, "azul", 1, 1, GatoPeloLargo.razas.MALAYO);
        GatoSinPelo rata= new GatoSinPelo("rata inmunda", 4, "Carne", 1, 3, GatoSinPelo.razas.ESFINGE);


        lista.add(anxo);
        lista.add(max);
        lista.add(simba);
        lista.add(pisable);
        lista.add(changui);
        lista.add(Rex);
        lista.add(misifu);
        lista.add(pelanas);
        lista.add(rata);

        for(Mascota m: lista){
            System.out.println(m.toString());
            if(m instanceof Perros){
                Perros.sonido();
            }
            if(m instanceof Gatos){
                Gatos.sonido();
            }
            if(m instanceof Mascota){
               System.out.println("Chaval aclarate de una p*** vez");
            }
        }


    }   
    
    
}
