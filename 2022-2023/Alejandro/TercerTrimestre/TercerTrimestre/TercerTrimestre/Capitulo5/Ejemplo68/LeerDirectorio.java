package Capitulo5.Ejemplo68;

import java.io.File;
import java.io.FileWriter;

public class LeerDirectorio {
    public static void main(String[] args) {
        File directorio= new File("C:\\Users\\Primero DAM\\Desktop\\IDK\\Alejandro\\programacion\\2022-2023\\Alejandro\\TercerTrimestre\\TercerTrimestre\\TercerTrimestre\\Capitulo5\\Ejemplo68\\");
        String[] archivos= directorio.list();
        for(int i=0; i<archivos.length;i++){
            System.out.println("Archivos: "+archivos[i]);
        }
    }
}
