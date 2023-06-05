package SolB3;

public class Entrenador extends Seleccion{

	// atributos propios
	private String idFederacion;

	// constructores, getters y setters
	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		// instancia un objeto de la superclase
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	// metodos heredados
	public void Concentrarse() {
		super.Concentrarse();
		System.out.println("Este es el metodo concentrarse de la" + " subclase Entrenador");
	}

	public void Viajar() {
		super.Viajar();
		System.out.println("Este es el metodo viajar de la" + " subclase Entrenador");
	}

	// metodos propios
	public void dirigirPartido() {
		System.out.println("Entrenador dirige un partido");
	}

	public void dirigirEntreno() {
		System.out.println("Entrenador dirige un entranamiento");
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos
				+ ", Edad=" + Edad + "]";
	}

}
