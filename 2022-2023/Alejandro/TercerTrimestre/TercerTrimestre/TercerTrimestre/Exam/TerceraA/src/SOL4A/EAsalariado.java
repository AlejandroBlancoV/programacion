package SOL4A;

import java.time.Year;

public class EAsalariado extends Empleado{
	
	double salariofijobase;
	
	
	public EAsalariado(){
		super();
	}
	
	public EAsalariado(String dNI, String nombre, String apellidos, int añoIngreso,double sal) {
		super(dNI, nombre, apellidos, añoIngreso);
		this.salariofijobase = sal;
	}
	
	

	public double getSalariofijobase() {
		return salariofijobase;
	}

	public void setSalariofijobase(double salariofijobase) {
		this.salariofijobase = salariofijobase;
	}

	@Override
	public void imprimir() {
		System.out.println("DNI: " + dni);
		System.out.println("nombre: " + nombre);
		System.out.println("apellidos: " + apellidos);
		System.out.println("añoIngreso: " + añoIngreso);
		System.out.println("SalarioBase: " + salariofijobase);
		
	}

	@Override
	public double obtenerSalario() {
		double salariofinal = 0;
		int añostrabajados =  2022 - this.añoIngreso ;
		
		if(añostrabajados <= 3) {
			salariofinal = this.salariofijobase*1.05;		
		}else if(añostrabajados > 3 && añostrabajados <= 7){
			salariofinal = this.salariofijobase*1.1;	
		}else if(añostrabajados > 7 && añostrabajados <= 15){
			salariofinal = this.salariofijobase*1.15;
		}else if (añostrabajados > 15) {
			salariofinal = this.salariofijobase*1.2;
		}
		return salariofinal;
	}

	

}
