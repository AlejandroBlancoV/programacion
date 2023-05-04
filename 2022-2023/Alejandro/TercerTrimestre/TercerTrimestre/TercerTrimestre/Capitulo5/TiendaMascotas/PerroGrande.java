package Capitulo5.TiendaMascotas;

public class PerroGrande extends Perros{
    enum razas{
       PASTOR_ALEMAN, ROTWEILLER, DOBERMAN
     }
 
         private razas raza;

        public PerroGrande(String nombre, int edad, String color, int peso, boolean muerde, razas raza) {
            super(nombre, edad, color, peso, muerde);
            this.raza = raza;
        }

        public razas getRaza() {
            return raza;
        }

        public void setRaza(razas raza) {
            this.raza = raza;
        }

        @Override
        public String toString() {
            return super.toString()+"PerroGrande [raza=" + raza + "]";
        }
 
}
