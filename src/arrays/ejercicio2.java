package arrays;

import java.util.Scanner;

public class ejercicio2 {

	public static final int MARCA_FI = -1;

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int[] array = new int[4];

		System.out.print("Escribe diferentes valores enteros.");
		System.out.println("Despu�s del �ltimo valor escribe un" + MARCA_FI);
		System.out.println("M�XIMO 100 VALORES");

		// semaforo de encontrar la marca
		boolean fin = false;
		int indice=0;
		
		
		while (!fin) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextInt()) {
				int valor = lector.nextInt();
				// Es la marca de fin?

				if (valor == MARCA_FI) {
					// S� lo es.
					fin = true;
				} else {
					// No. Es un valor que debe ser tratado.

					System.out.println("Valor le�do: " + valor);
					array[indice]=valor;
					indice++;
				}
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				lector.next();
			}
		}
		// Los valores que sobren en la �ltima l�nea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han le�do todos los valores.");
	}

}
