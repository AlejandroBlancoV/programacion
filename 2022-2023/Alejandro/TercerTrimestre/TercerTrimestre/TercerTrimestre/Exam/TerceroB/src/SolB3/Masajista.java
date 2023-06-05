package SolB3;

public class Masajista extends Seleccion{
    //atributos
	String Titulacion;
	private int aniosExperiencia;
	// constructores, getters y setters
	public Masajista() {
		super();
		}
	public Masajista(int id, String nombre, String apellidos, int
			edad, String Titulacion, int años) {
		//instancia un objeto de la superclase	
		super(id, nombre, apellidos, edad);
		this.Titulacion=Titulacion;
		this.aniosExperiencia=años;
	}
	public String getTitulacion() {
		return Titulacion;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	//metodos heredados
	public void Concentrarse() {
	System.out.println("Este es el metodo concentrarse"
			+ " de la subclase Masajista");
	}
	public void Viajar() {
	System.out.println("Este es el metodo viajar de la"
			+ " subclase Masajista");
	}
	//metodos propios
	public void darMasaje() {
		System.out.println("Masajista dando un masaje");
	}
	@Override
	public String toString() {
		return "Masajista [Titulacion=" + Titulacion + ", aniosExperiencia=" + aniosExperiencia + ", Nombre="
				+ Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}
	
}
