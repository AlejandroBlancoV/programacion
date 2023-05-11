package Capitulo5.Ejemplo49;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Medico> listaMedicos= new ArrayList<>();
        Medico med1= new Medico("Kerri Kohueles");
        Pediatra ped1= new Pediatra("Monica Galindo", Pediatra.tipos.NEUROLOGO);
        Ortopedista orto= new Ortopedista("LAKASKA YANA",Ortopedista.tipos.MAXILOFACIAL);

        listaMedicos.add(med1);
        listaMedicos.add(ped1);
        listaMedicos.add(orto);

       

        for(int i=0;i<listaMedicos.size();i++){
            Medico a= (Medico) listaMedicos.get(i);
            if(a instanceof Ortopedista){
                System.out.println("el objeto en el indice "+i+" es Ortopedista");
                continue;
            }
            if(a instanceof Pediatra){
                System.out.println("el objeto en el indice "+i+" es Pediatra");
                continue;
            }
            if(a instanceof Medico){
                System.out.println("el objeto en el indice "+i+" es un becario fijo");
                continue;
            }
        }

        for (Medico medico : listaMedicos) {
            System.out.println(medico.toString()); 
         }
    }
}
