package solB4;

import java.util.Date;

public class CongeladoAgua extends Congelado{

	private int salinidadAgua;

	public CongeladoAgua() {
		super();
		salinidadAgua=0;
	}

	public CongeladoAgua(int salinidadAgua, String informacion, int tempRecomendada, int numeroDeLote, Date fechaDeCapacidad,
			String paisOrigen, Date fecEnvasado) {
		super(informacion, tempRecomendada, numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
		this.salinidadAgua=salinidadAgua;
	}

	public int getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(int salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}

	@Override
	public String toString() {
		return "CongeladoAgua [salinidadAgua=" + salinidadAgua + ", tempRecomendada=" + tempRecomendada
				+ ", numeroDeLote=" + numeroDeLote + ", fechaDeCapacidad=" + fechaDeCapacidad + ", paisOrigen="
				+ paisOrigen + ", fecEnvasado=" + fecEnvasado + "]";
	}
	
	
	
}
