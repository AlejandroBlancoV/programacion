package solB4;

import java.util.Date;

public class Refrigerado extends ProductoConTemp{

	private int codOrganismo;

	public Refrigerado() {
		super();
		codOrganismo=0;
		// TODO Auto-generated constructor stub
	}

	public Refrigerado(int codOrganismo, int tempRecomendada, int numeroDeLote, Date fechaDeCapacidad, String paisOrigen,
			Date fecEnvasado) {
		super(tempRecomendada, numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
		this.codOrganismo = codOrganismo;
	}

	public int getCodOrganismo() {
		return codOrganismo;
	}

	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
	}

	@Override
	public String toString() {
		return "Refrigerado [codOrganismo=" + codOrganismo + ", tempRecomendada=" + tempRecomendada + ", numeroDeLote="
				+ numeroDeLote + ", fechaDeCapacidad=" + fechaDeCapacidad + ", paisOrigen=" + paisOrigen
				+ ", fecEnvasado=" + fecEnvasado + "]";
	}
	
	
}
