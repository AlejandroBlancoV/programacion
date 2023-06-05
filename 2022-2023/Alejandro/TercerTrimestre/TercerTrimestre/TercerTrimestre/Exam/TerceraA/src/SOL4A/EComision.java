package SOL4A;

public class EComision extends Empleado{
	
	int numClientes;
	double valorCliente;
	
	public EComision() {
		super();
	}
	
	public EComision(String dNI, String nombre, String apellidos, int añoIngreso,int numc,double v) {
		super(dNI, nombre, apellidos, añoIngreso);
		this.numClientes = numc;
		this.valorCliente = v;
	}

	

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	public double getValorCliente() {
		return valorCliente;
	}

	public void setValorCliente(double valorCliente) {
		this.valorCliente = valorCliente;
	}

	@Override
	public void imprimir() {
		System.out.println("DNI: " + dni);
		System.out.println("nombre: " + nombre);
		System.out.println("apellidos: " + apellidos);
		System.out.println("añoIngreso: " + añoIngreso);
		System.out.println("Numero Clientes: " + numClientes);
		System.out.println("valor de cada cliente : " + valorCliente);
		
	}

	@Override
	public double obtenerSalario() {
		double salariofinal = this.numClientes * this.valorCliente;
		
		if(salariofinal < 750) {
			salariofinal = 750;
		}
		
		return salariofinal;
	}

}
