package solB4;

import java.util.Date;

public abstract class ProductoConTemp extends Producto{
	
	protected int tempRecomendada;

	public ProductoConTemp() {
		super();
		this.tempRecomendada=0;
	}

	public ProductoConTemp(int tempRecomendada, int numeroDeLote, Date fechaDeCapacidad, String paisOrigen, Date fecEnvasado) {
		super(numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
		this.tempRecomendada=tempRecomendada;
	}	
	
}
