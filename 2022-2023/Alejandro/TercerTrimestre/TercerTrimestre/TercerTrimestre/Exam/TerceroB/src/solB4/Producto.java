package solB4;

import java.util.Date;

public abstract class Producto {
	
	protected int numeroDeLote;
	protected Date fechaDeCapacidad;
	protected String paisOrigen;
	protected Date fecEnvasado;
	
	
	public Producto() {
		this.numeroDeLote = 0;
		this.fechaDeCapacidad = new Date();
		this.paisOrigen = "";
		this.fecEnvasado = new Date();
	}

	public Producto(int numeroDeLote, Date fechaDeCapacidad, String paisOrigen, Date fecEnvasado) {
		this.numeroDeLote = numeroDeLote;
		this.fechaDeCapacidad = fechaDeCapacidad;
		this.paisOrigen = paisOrigen;
		this.fecEnvasado = fecEnvasado;
	}
	
}
