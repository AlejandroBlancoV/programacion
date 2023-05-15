package Capitulo5.Ejemplo68;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.chrono.AbstractChronology;

public class LeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo="C:\\Users\\Primero DAM\\Desktop\\IDK\\Alejandro\\programacion\\2022-2023\\Alejandro\\TercerTrimestre\\TercerTrimestre\\TercerTrimestre\\Capitulo5\\Ejemplo68\\prueba.txt";
        FileInputStream archivo;
        InputStreamReader conversor;
        BufferedReader filtro;
        String linea;

        try {
            archivo= new FileInputStream(nombreArchivo);
            conversor=new InputStreamReader(archivo);
            filtro= new BufferedReader(conversor);
            linea= filtro.readLine();
            while(linea != null){
                System.out.println(linea);
                linea=filtro.readLine();
            }
            filtro.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo");
        }
    }
    
}
