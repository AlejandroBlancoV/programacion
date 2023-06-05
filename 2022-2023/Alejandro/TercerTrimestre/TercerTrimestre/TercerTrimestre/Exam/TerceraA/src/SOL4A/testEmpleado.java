package SOL4A;

import java.util.ArrayList;

public class testEmpleado {
	
	
	public static void sueldoMayor(ArrayList<Empleado> empresa) {
		double max = 0;
		String nombre  = "";
		String apellido  = "";
		for (Empleado empleado : empresa) {
			if(empleado.obtenerSalario() > max) {
				max = empleado.obtenerSalario();
				nombre = empleado.getNombre();
				apellido = empleado.getApellidos();
			}
		}
		
		System.out.println("Empleado que más cobra es " + nombre +" " + apellido + " con un salario de " + max);
	}
	
	public static void muestraTodos(ArrayList<Empleado> empresa) {
		for (Empleado empleado : empresa) {
			empleado.imprimir();
			System.out.println("SALARIO: "+empleado.obtenerSalario());
			System.out.println("----------------");
		}
	}
	
	

	public static void main(String[] args) {
		ArrayList<Empleado> empresa = new ArrayList<Empleado>();
		
		Empleado javier = new EAsalariado("569587A", "Javier", "Gómez", 2008, 1225.0);
		Empleado eva = new EComision("695235B", "Eva", "Nieto", 2010, 179, 8.1);
		
		EComision jose = new EComision();
		
		jose.setDni("741258C");
		jose.setNombre("José");
		jose.setApellidos("Ruiz");
		jose.setAñoIngreso(2012);
		jose.setNumClientes(81);
		jose.setValorCliente(7.9);
		
		EAsalariado maria = new EAsalariado();
		
		maria.setNombre("Maria");
		maria.setApellidos("Núñez");
		maria.setDni("896325D");
		maria.setAñoIngreso(2013);
		maria.setSalariofijobase(1155.0);
		
		empresa.add(jose);
		empresa.add(javier);
		empresa.add(eva);
		empresa.add(maria);
		
		
		muestraTodos(empresa);
		
		
		
		sueldoMayor(empresa);
		
		

	}

}
