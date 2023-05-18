package Capitulo5.Ejemplo81;

public class TestConsola {
    public static void main(String[] args) {
        ListaPersonas alumnos = new ListaPersonas();
        alumnos.añadirPersona(new Persona("Paco", "Merte", "1234", "calle carajo 73"));
        alumnos.listar();
        alumnos.añadirPersona(new Persona("Mhirake", "Kulo", "1234", "calle carajo 73"));
        alumnos.listar();
        alumnos.añadirPersona(new Persona("Mary", "Joana", "1234", "calle carajo 73"));
        alumnos.listar();
        alumnos.añadirPersona(new Persona("Yanis", "Toy", "1234", "calle carajo 73"));
        alumnos.listar();

        alumnos.eliminarPersona(4);
        alumnos.listar();
        alumnos.eliminarPersona(1);
        alumnos.listar();
        alumnos.borrarLista();
        System.out.println("lista borrada");

    }
}
