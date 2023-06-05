package solB4;

import java.util.ArrayList;
import java.util.Iterator;

public class TestHerencia {
	
	public static void main(String[] args) {
		Producto f1 = new Fresco();
		Producto f2 = new Fresco();
		Producto r1 = new Refrigerado();
		Producto r2 = new Refrigerado();
		Producto r3 = new Refrigerado();
		Producto cag1 = new CongeladoAgua();
		Producto cag2 = new CongeladoAgua();
		Producto car1 = new CongeladoAire();
		Producto car2 = new CongeladoAire();
		Producto cn = new CongeladoNitrogeno();
		
		ArrayList<Producto> list = new ArrayList<>();
		
		list.add(f1);
		list.add(f2);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(cag1);
		list.add(cag2);
		list.add(car1);
		list.add(car2);
		list.add(cn);
		
		Iterator<Producto> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	
}
