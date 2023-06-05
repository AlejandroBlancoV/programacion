package solB2;

public class Delantero extends Jugador{
	private int golesMetidos;
	private int penaltisFallados;
	
	//tambien hubiera valido dejar dos constantes con los valores por defecto
	//en la clase jugador original
	
	public Delantero() {
		super("sin nombre", "sin demarcacion", 0, 0, 0, 0);
		this.golesMetidos=0;
		this.penaltisFallados=0;
	}

	public Delantero(String n, String d, int p, int g, int a, int r, int golesMetidos, int penaltisFallados) {
		super(n, d, p, g, a, r);
		this.golesMetidos = golesMetidos;
		this.penaltisFallados = penaltisFallados;
	}

	public int getGolesMetidos() {
		return golesMetidos;
	}

	public void setGolesMetidos(int golesMetidos) {
		this.golesMetidos = golesMetidos;
	}

	public int getPenaltisFallados() {
		return penaltisFallados;
	}

	public void setPenaltidFallados(int penaltisFallados) {
		this.penaltisFallados = penaltisFallados;
	}
	
	@Override
	public void imprimir() {
		/*System.out.println("Nombre: " + nombre);
		System.out.println("Demarcación: " + demarcacion);
		System.out.println("Partidos Jugados: " + partidosJugados);
		System.out.println("Goles Marcados: " + golesMarcados);
		System.out.println("Tarjetas amarillas:" + tarjetasAmarillas);
		System.out.println("Tarjetas Rojas: " + tarjetasRojas);
		System.out.println("Identificador: " + identificador);*/
		super.imprimir();
		System.out.println("Goles metidos: "+ golesMetidos);
		System.out.println("Penaltis Fallados: "+ penaltisFallados);
	}
}
