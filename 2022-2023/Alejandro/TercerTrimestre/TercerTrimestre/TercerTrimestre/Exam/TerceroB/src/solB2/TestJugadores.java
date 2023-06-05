package solB2;

import java.util.ArrayList;

public class TestJugadores {

	public static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public static void main(String[] args) {

		Jugador benji = new Jugador("Benji", "Portero", 3, 4, 3, 1);
		Jugador menganito = new Jugador("Menganito", "Defensa", 2, 3, 7, 3);
		Jugador chicho = new Delantero("Chicho Terremoto", "Delantero", 4, 3, 1, 2, 5, 3);
		Jugador oliver = new Delantero("Oliver", "Delantero", 5, 2, 3, 6, 3, 8);
		Jugador markLenders = new Delantero("Mark Lenders", "Delantero", 3, 4, 2, 1, 9, 2);

		jugadores.add(benji);
		jugadores.add(menganito);
		jugadores.add(chicho);
		jugadores.add(oliver);
		jugadores.add(markLenders);

		for (Jugador j : jugadores) {
			// entrenador
			if (j instanceof Delantero) {
				((Delantero) j).imprimir();
			}

		}
	}
}
