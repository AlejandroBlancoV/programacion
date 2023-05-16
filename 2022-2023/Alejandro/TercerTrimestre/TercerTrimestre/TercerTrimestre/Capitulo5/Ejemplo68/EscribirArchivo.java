package Capitulo5.Ejemplo68;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
    public static void main(String[] args) {
    FileWriter archivo= null;
    PrintWriter impresor=null;
    try {
        archivo= new FileWriter("C:\\Users\\Primero DAM\\Desktop\\IDK\\Alejandro\\programacion\\2022-2023\\Alejandro\\TercerTrimestre\\TercerTrimestre\\TercerTrimestre\\Capitulo5\\Ejemplo68\\prueba2.txt");
        impresor= new PrintWriter(archivo);
        for(int i=0;i<10;i++){
            impresor.println("Ronda "+i);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }finally{
        try {
            if(archivo != null){
                archivo.close();
            }

        } catch (Exception e2) {
           e2.printStackTrace();
        }
    }



    }

}