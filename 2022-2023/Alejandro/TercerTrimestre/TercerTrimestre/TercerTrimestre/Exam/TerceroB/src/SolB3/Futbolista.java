package SolB3;

public class Futbolista extends Seleccion{

    //atributos especificos
	int dorsal;
	private String demarcacion;
	// constructores, getters y setters
	public Futbolista() {
		super();
	}
	public Futbolista(int id, String nombre, String apellidos, int
			edad, int dorsal, String demarcacion) {
		//instancia un objeto de la superclase	
		super(id, nombre, apellidos, edad);
			this.dorsal = dorsal;
			this.demarcacion = demarcacion;
		}
	public int getDorsal() {
		return dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
    //metodos heredados Viajar y Concentrarse
	//podemos sobreescribirlos o no
	public void Concentrarse() {
	System.out.println("Este es el metodo concentrarse de la "
			+ "subclase Futbolista");
    }
	public void Viajar() {
	System.out.println("Este es el metodo viajar de la"
			+ " subclase Futbolista");
	}
	//metodos propios
	public void jugarPartido() {
	System.out.println("Futbolista juega un partido");	
	}
	public void entrenar() {
	System.out.println("Futbolista realiza un entrenamiento");
	}
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", Nombre=" + Nombre
				+ ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}
			
}
