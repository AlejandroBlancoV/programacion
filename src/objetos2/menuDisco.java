package objetos2;

import java.util.Scanner;

public class menuDisco {

	// N determina el tama�o del array
	static int N = 3;

	public static void listarDiscos(Disco[] col) {
		for (int i = 0; i < N; i++) {
			if (!col[i].getCodigo().equals("LIBRE")) {
				System.out.println(col[i]);
			}
		}
	}

	public static void anadirDiscos(Disco[] col) {
	
		Scanner sc = new Scanner(System.in);
		// Busca la primera posici�n libre del array
		int primeraLibre = -1;
		do {
			primeraLibre++;
		} while (primeraLibre<N &&
				!((col[primeraLibre].getCodigo()).equals("LIBRE")));
		
		if (primeraLibre<N) {

		System.out.println("Por favor, introduzca los datos del disco.");

		System.out.print("C�digo: ");
		String codigoIntroducido = sc.nextLine();
		col[primeraLibre].setCodigo(codigoIntroducido);

		System.out.print("Autor: ");
		String autorIntroducido = sc.nextLine();
		col[primeraLibre].setAutor(autorIntroducido);

		System.out.print("T�tulo: ");
		String tituloIntroducido = sc.nextLine();
		col[primeraLibre].setTitulo(tituloIntroducido);

		System.out.print("G�nero: ");
		String generoIntroducido = sc.nextLine();
		col[primeraLibre].setGenero(generoIntroducido);

		System.out.print("Duraci�n: ");
		int duracionIntroducida = Integer.parseInt(sc.nextLine());
		col[primeraLibre].setDuracion(duracionIntroducida);
		}else {
			System.out.println("No hay registros libres");
			System.out.println("Elimine algun disco");
		}
	}

	public static void modificarDiscos(Disco[] col, String cod) {

		int i = -1;
		do {
			i++;
		} while (i<N && !((col[i].getCodigo()).equals(cod)));
		
		if(i<N) {

		System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

		System.out.println("C�digo: " + col[i].getCodigo());
		System.out.print("Nuevo c�digo: ");
		String codigoIntroducido = System.console().readLine();
		if (!codigoIntroducido.equals("")) {
			col[i].setCodigo(codigoIntroducido);
		}

		System.out.println("Autor: " + col[i].getAutor());
		System.out.print("Nuevo autor: ");
		String autorIntroducido = System.console().readLine();
		if (!autorIntroducido.equals("")) {
			col[i].setAutor(autorIntroducido);
		}

		System.out.println("T�tulo: " + col[i].getTitulo());
		System.out.print("Nuevo t�tulo: ");
		String tituloIntroducido = System.console().readLine();
		if (!tituloIntroducido.equals("")) {
			col[i].setTitulo(tituloIntroducido);
		}

		System.out.println("G�nero: " + col[i].getGenero());
		System.out.print("Nuevo g�nero: ");
		String generoIntroducido = System.console().readLine();
		if (!generoIntroducido.equals("")) {
			col[i].setGenero(generoIntroducido);
		}

		System.out.println("Duraci�n: " + col[i].getDuracion());
		System.out.print("Duraci�n: ");
		String duracionIntroducidaString = System.console().readLine();
		if (!duracionIntroducidaString.equals("")) {
			col[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
		}
		}else {
			System.out.println("Codigo no encontrado");
		}
				
	}

	public static void borrarDiscos(Disco[] col, String cod) {
		int i = -1;
		do {
			i++;
		} while (!((col[i].getCodigo()).equals(cod)));
		col[i].setCodigo("LIBRE");
		System.out.println("Album borrado.");
	}

	public static void mostrarMenu() {
		System.out.println("\n\nCOLECCI�N DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.print("Introduzca una opci�n: ");
	}
	
	public static void menu(Disco[]album) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String codigoIntroducido;
		
		do {
			mostrarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");
				listarDiscos(album);
				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
				anadirDiscos(album);
				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");

				System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
				codigoIntroducido = sc.nextLine();

				modificarDiscos(album, codigoIntroducido);

				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");

				System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
				codigoIntroducido = System.console().readLine();

				borrarDiscos(album, codigoIntroducido);

				break;
				
			case 5:
				System.out.println("Abandonando programa");
				break;
				

			default:
				System.out.println("Opcion no valida tontito");
			} // switch
		} while (opcion != 5);
	}
	
	public static  Disco[] modeloDatos() {
		// Crea el array de discos
		Disco[] album = new Disco[N];

		// Crea todos los discos que van en cada una de
		// las celdas del array llamado album
		for (int i = 0; i < N; i++) {
			album[i] = new Disco();
		}
		return album;
	}
	
	public static void main(String[] args) {

		menu(modeloDatos());
	
	}
}
