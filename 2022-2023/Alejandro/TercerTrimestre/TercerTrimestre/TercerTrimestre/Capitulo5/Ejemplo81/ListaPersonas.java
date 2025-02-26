package Capitulo5.Ejemplo81;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPersonas implements Serializable{
    public ArrayList<Persona> listaPersonas;
    public ListaPersonas(){
        listaPersonas= new ArrayList<>();
    }
    public void añadirPersona(Persona p){
        listaPersonas.add(p);
    }
    public void eliminarPersona(int i){
        if(i<listaPersonas.size())
        listaPersonas.remove(i);
        else{
            System.out.println("indice erroneo");
        }
    }
    public void borrarLista(){
        listaPersonas.removeAll(listaPersonas);
    }
    public void listar(){
        for(int i=0; i<listaPersonas.size();i++){
            System.out.println("posicion: "+i+" : "+listaPersonas.get(i).toString());
        }
    }
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
}
