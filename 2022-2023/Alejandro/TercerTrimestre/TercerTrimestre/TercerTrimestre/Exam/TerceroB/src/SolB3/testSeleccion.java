package SolB3;

import java.util.ArrayList;

public class testSeleccion {

	// ArrayList de objetos Seleccion. Independientemente de
	// la clase hija a la que pertenezca el objeto
	public static ArrayList<Seleccion> integrantes = new ArrayList<Seleccion>();

	public static void main(String[] args) {

		Seleccion delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Seleccion iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Seleccion raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en " + "Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		double totalMulta=0;

		for (Seleccion s : integrantes) {
			// entrenador
			if (s instanceof Entrenador) {
				System.out.println(((Entrenador) s).aumentar(5));
				System.out.println(((Entrenador) s).disminuir(2));
				System.out.println(((Entrenador) s).aumentar(50));
				totalMulta+=s.getMulta();
				
			}
			// futbolista
			if (s instanceof Futbolista) {
				System.out.println(((Futbolista) s).aumentar(7));
				System.out.println(((Futbolista) s).disminuir(2));
				System.out.println(((Futbolista) s).aumentar(13));
				totalMulta+=s.getMulta();
			}
			// masajista
			if (s instanceof Masajista) {
				System.out.println(((Masajista) s).aumentar(1));
				System.out.println(((Masajista) s).disminuir(4));
				System.out.println(((Masajista) s).aumentar(70));
				totalMulta+=s.getMulta();
			}
		}
		
		System.out.println(totalMulta);
	}

}
