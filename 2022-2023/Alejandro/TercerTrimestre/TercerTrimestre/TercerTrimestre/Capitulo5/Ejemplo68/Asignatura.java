package Capitulo5.Ejemplo68;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Asignatura  implements Serializable{
    int codigo;
    String nombre;
    int creditos;
    public Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    void imprimir(){
        System.out.println("Codigo de la asignatura = "+codigo);
        System.out.println("Nombre de la asignatura = "+nombre);
        System.out.println("Cantidad de creditos = "+creditos);
    }

    void escribirAsignatura(){
        try {
            FileOutputStream archivo= new FileOutputStream("Asignatura.dat");
            ObjectOutputStream salida= new ObjectOutputStream(archivo);
            salida.writeObject(this);
            salida.close();
        } catch (IOException e) {
           System.out.println("No se pudo escribir en el archivo");
        }
    }

    void leerAsignatura(){
        try {
            FileInputStream archivo= new FileInputStream("Asignatura.dat");
            ObjectInputStream entrada=new ObjectInputStream(archivo);
            Asignatura asignatura= (Asignatura) entrada.readObject();
           asignatura.imprimir();
           entrada.close();
        } catch (FileNotFoundException e) {
           System.out.println("No se pudo leer el archivo");
        }catch(IOException e){
            System.out.println("Error de Entrada/Salida");
        
        }catch(Exception e ){
            System.out.println("Error al leer el archivo");
        }
    }
}
