package solB1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ejercicio1 {
	public static List<Carta> darMano(){
		Carta nueva;
		List<Carta> mano = new ArrayList<Carta>();
		
		do {
			nueva = new Carta();
			if(!mano.contains(nueva)) {
				mano.add(nueva);
			}
		}while(mano.size()<7);
		
		Collections.sort(mano);
		for(Carta carta : mano)
			System.out.println(carta);
		return mano;
	}
	
	static HashMap<String,Integer> puntos=new HashMap<>();
	
	static void puntosBrisca(){
		puntos.put("A",11);
		puntos.put("K",10);
		puntos.put("Q",10);
		puntos.put("J",10);
		puntos.put("10",10);
		puntos.put("9",9);
		puntos.put("8",8);
		puntos.put("7",7);
		puntos.put("6",6);
		puntos.put("5",5);
		puntos.put("4",4);	
		puntos.put("3",3);	
		puntos.put("2",2);		
	}
	
	static String darPuntuacion(List<Carta> j ) {
		int tanteo = 0;
		for(Carta c: j) {
			tanteo+=puntos.get(c.getValor());
			
		}
		return "LOS PUNTOS OBTENIDOS SON "+tanteo;
	}
	
	public static void main(String[] args) {
		puntosBrisca();
		List<Carta>  jugada = darMano();
		System.out.println(jugada);
		System.out.println(darPuntuacion(jugada));
		
	}
	
}

