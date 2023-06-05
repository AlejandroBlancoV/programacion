package sol1A;

import java.util.ArrayList;
import java.util.List;



/*
 Crear un fichero de testeo con un list de tres porteros y dos jugadores. 
 Recórralo mostrando con el método imprimir 
 SÓLO la información de cada portero.
*/
public class TestEjercicio01 {
public static void main(String[] args) {
	List<Jugador> equipo = new ArrayList<Jugador>();
	
	Portero portero1 = new Portero("Casillas", "Portero", 5, 1, 0, 0, 3, 10);
	Portero portero2 = new Portero("Manuel", "Portero", 1, 0, 0, 0, 0, 2);
	Portero portero3 = new Portero("Josue", "Portero", 3, 0, 1, 0, 5, 4);
	
	Jugador jugador1 = new Jugador("Ramiro", "Delantero", 3, 1, 0, 1);
	Jugador jugador2 = new Jugador("Pedro", "Defensa", 1, 1, 1, 4);
	
	equipo.add(portero1);
	equipo.add(portero2);
	equipo.add(portero3);
	equipo.add(jugador1);
	equipo.add(jugador2);
	
	
	for (Jugador j : equipo) {
		// entrenador
		if (j instanceof Portero) {
			j.imprimir();
		}
	}
}
}
