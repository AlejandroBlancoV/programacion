package sol1A;

public class Portero extends Jugador{

	private int golesRecibidos;
	private int penaltisParados;
	
	
	/*Crear un constructor para dar valor a todos los atributos de la clase Portero, incluidos los heredados. 
	 * Deberá usar el constructor de la clase Jugador.
	 * */
	
	public Portero(String nombre, String demarcacion, int partJugados, int golesMarc,
			int amarillas,int rojas, int golesReciv,int penaltisParados) {
		super(nombre,demarcacion,partJugados,golesMarc,amarillas,rojas);
		this.golesRecibidos=golesReciv;
		this.penaltisParados=penaltisParados;
	}
	
	
	/*Crear un constructor por defecto similar al de la clase Jugador.*/
	public Portero() {
		super("sin nombre", "sin demarcacion", 0, 0, 0, 0);
		this.golesRecibidos=0;
		this.penaltisParados=0;
	}

	/*. Crear getters y setters*/
	public int getGolesRecibidos() {
		return golesRecibidos;
	}


	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}


	public int getPenaltisParados() {
		return penaltisParados;
	}


	public void setPenaltisParados(int penaltisParados) {
		this.penaltisParados = penaltisParados;
	}

	/*Sobrescribir el método imprimir, para que imprima todos los parámetros.*/
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Goles recividos: " + golesRecibidos);
		System.out.println("Penaltis parados: " + penaltisParados);
	}
	
	
	
	 
}
