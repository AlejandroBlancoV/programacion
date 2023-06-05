package solB4;

import java.util.Date;

public abstract class Congelado extends ProductoConTemp {
	
	public Congelado() {
		super();
	}

	public Congelado(String informacion, int tempRecomendada, int numeroDeLote, Date fechaDeCapacidad, String paisOrigen,
			Date fecEnvasado) {
		super(tempRecomendada, numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
	}
	
	
}
