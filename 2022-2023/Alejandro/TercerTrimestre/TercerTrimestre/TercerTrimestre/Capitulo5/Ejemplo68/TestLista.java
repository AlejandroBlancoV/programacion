package Capitulo5.Ejemplo68;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestLista {
    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList<Asignatura> arrayEscribir= new ArrayList<Asignatura>();
        ArrayList<Asignatura> arrayLeer;

        System.out.println("asignaturas que vamos a escribir en el fichero: ");
        for(int i=0;i<5;i++){
            Asignatura nuevoObjeto= new Asignatura(i, "Asignatura " + i, 5*i);
            arrayEscribir.add(nuevoObjeto);
            System.out.println("arrayEscribir[" + i + "] = " + arrayEscribir.get(i).toString());
        }

        try {
            System.out.println("Guardando ArrayList en el fichero objetos.dat...");
            ObjectOutputStream escribiendoFichero= new ObjectOutputStream(new FileOutputStream("objetos.dat"));
            //escribe todo el ArrayList
            escribiendoFichero.writeObject(arrayEscribir);
            escribiendoFichero.close();
            System.out.println("Guardado OK!!!");
            System.out.println("Leyendo ArrayList del fichero objetos.dat..");
            ObjectInputStream leyendoFichero= new ObjectInputStream(new FileInputStream("objetos.dat"));
            arrayLeer=(ArrayList<Asignatura>) leyendoFichero.readObject();
            System.out.println("Leido OK!!!");
            System.out.println("Datos leidos del fichero");
            for(int i=0;i<arrayLeer.size();i++){
                System.out.println("arrayLeer[" + i + "] = " + arrayLeer.get(i).toString());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
