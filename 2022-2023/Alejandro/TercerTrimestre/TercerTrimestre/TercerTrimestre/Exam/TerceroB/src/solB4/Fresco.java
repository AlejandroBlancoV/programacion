package solB4;

import java.util.Date;

public class Fresco extends Producto{

	public Fresco() {
		super();
	}

	public Fresco(int numeroDeLote, Date fechaDeCapacidad, String paisOrigen, Date fecEnvasado) {
		super(numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
	}

	@Override
	public String toString() {
		return "Fresco [numeroDeLote=" + numeroDeLote + ", fechaDeCapacidad=" + fechaDeCapacidad + ", paisOrigen="
				+ paisOrigen + ", fecEnvasado=" + fecEnvasado + "]";
	}
	
	

}
