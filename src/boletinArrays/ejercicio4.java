package boletinArrays;


/*
 * Leer 10 n�meros enteros. Debemos mostrarlos en el
siguiente orden: el primero, el �ltimo, el segundo, el
pen�ltimo, el tercero, etc.
 */
public class ejercicio4 {

	public static void main(String[] args) {
		
		int[] array = { 1, 3, 0, -5, 2, 0, -4, - 7,11,-2,9 };
		
	
		int medio=0;
		
		//opcion 1
		if(array.length%2==0)
			medio=array.length/2;
		else
			medio=array.length/2+1;
		System.out.println(medio+ " indice ");
		
		for ( int i=0,j=array.length-1 ; i<medio ;i++,j-- ) {
			System.out.println(array[i]);

			if(j!=medio-1)
				System.out.println(array[j]);
		}
		
	}
}
