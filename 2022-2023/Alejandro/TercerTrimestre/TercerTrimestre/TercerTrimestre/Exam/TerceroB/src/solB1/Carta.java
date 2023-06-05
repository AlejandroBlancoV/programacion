package solB1;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;

public class Carta implements Comparable{
	//Necesito implementar un equals
	//Necesito implementar un compareTo
	
	String valor;
	String palo;
	
	static Map<String, Integer> map = new TreeMap<>();
	
	static void rellenaMapa() {
		map.put("A", 1);
		map.put("K", 2);
		map.put("J", 3);
		map.put("Q", 4);
		map.put("10", 5);
		map.put("9", 6);
		map.put("8", 7);
		map.put("7", 8);
		map.put("6", 9);
		map.put("5", 10);
		map.put("4", 11);
		map.put("3", 12);
		map.put("2", 13);
		
	}
	
	Carta(){
		this.valor=generaValor();
		this.palo=generaPalo();
		rellenaMapa();
	}
	
	Carta(String palo, String valor){
		this.palo=palo;
		this.valor=valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public String getValor() {
		return valor;
	}
	
	
	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	private static String generaPalo() {
		
		Random r = new Random();
		int n=1+r.nextInt(4-0);
		
		switch(n) {
		
		case 1:
			return "Corazones";
		case 2:
			return "Diamantes";
		case 3:
			return "Picas";
		case 4:
			return "Treboles";
		}
		
		return null;
	}
	
	private static String generaValor() {
		
		Random r = new Random();
		int n=1+r.nextInt(13-0);
		
		switch(n) {
		
		case 1:
			return "A";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		}
		
		return null;
	}

	
	@Override
	public String toString() {
		return valor + " de " + palo ;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(palo, other.palo) && Objects.equals(valor, other.valor);
	}

	@Override
	public int compareTo(Object o) {
		Carta c =(Carta) o;
		
		if((this.palo.compareTo(c.palo))==0)
			return map.get(this.valor).compareTo(map.get(c.valor));
		else
			return (this.palo).compareTo(c.palo);
	}
}
