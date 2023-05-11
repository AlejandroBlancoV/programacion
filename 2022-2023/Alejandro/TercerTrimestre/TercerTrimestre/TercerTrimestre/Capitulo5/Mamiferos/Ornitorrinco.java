package Capitulo5.Mamiferos;

public class Ornitorrinco extends Mamifero implements Oviparo{
   @Override
   void amamantarCrias() {
       System.out.println("El ornitorrinco amamanta a sus crías");
       
   }
   @Override
   public void ponerHuevos() {
       System.out.println("El ornitorrinco pone huevos");
   }
    
}
