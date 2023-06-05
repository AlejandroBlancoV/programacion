package SolB3;

public class Seleccion implements Sanciones{

	// atributos
	private int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;
	static protected double multa=0;

	// constructor, getter y setter
	public Seleccion() {
		}
	public Seleccion(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
		}
	protected int getId() {
		return id;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public int getEdad() {
		return Edad;
	}
	
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	// metodos propios
	public void Concentrarse() {
	System.out.println("Este es el metodo concentrarse de la"
			+ " superclase Seleccion");
	}
	public void Viajar() {
	System.out.println("Este es el metodo viajar de la"
			+ " superclase Seleccion");
	}
	@Override
	public String toString() {
		return "Seleccion [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}
	@Override
	public String aumentar(double cuanto) {
		
		if(multa > MULTA_MAXIMA) {
			return "La cantidad excede el maximo permitido";
		}
		multa=multa+cuanto;
				return "La multa aumenta a "+multa;
	}
	@Override
	public String disminuir(double cuanto) {
		
		if(multa-cuanto <0) {
			return "La cantidad no puede estar por debajo de CERO";
		}
		multa=multa-cuanto;
		return "La multa disminuye a "+multa;
	}
	
	
}
