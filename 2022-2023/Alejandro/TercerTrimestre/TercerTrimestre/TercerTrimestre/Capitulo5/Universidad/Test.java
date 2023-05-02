package Capitulo5.Universidad;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Persona> uni= new ArrayList<Persona>();

        Persona gente= new Persona("Antonio", "cebem65");
        Estudiante anxo= new Estudiante("Anxo", "camino de trufas 33", "ninguna", 3);
        Profesor pepe= new Profesor("Pepe", "Hispanidad 126", "programacion", "un pro");
        uni.add(gente);
        uni.add(anxo);
        uni.add(pepe);

        for(Persona p : uni){
            System.out.println(p.toString());
        }
    }     
}
