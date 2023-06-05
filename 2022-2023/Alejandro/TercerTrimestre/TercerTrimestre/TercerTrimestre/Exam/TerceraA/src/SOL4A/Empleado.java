package SOL4A;

public abstract class Empleado {

	String dni;
	String nombre;
	String apellidos;
	int añoIngreso;
	
	public Empleado() {
		
	}
	public Empleado(String dNI, String nombre, String apellidos, int añoIngreso) {
		this.dni = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.añoIngreso = añoIngreso;
	}

	public abstract void imprimir();
	
	public abstract double obtenerSalario();
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAñoIngreso() {
		return añoIngreso;
	}
	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}
	
	
	


	
}
