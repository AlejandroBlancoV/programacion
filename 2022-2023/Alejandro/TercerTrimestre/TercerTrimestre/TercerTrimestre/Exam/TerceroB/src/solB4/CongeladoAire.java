package solB4;

import java.util.Date;

public class CongeladoAire extends Congelado{
	
	private int percentNitro;
	private int percentOxig;
	private int percentDioxDeCarb;
	private int percentVaporAgua;
	
	public CongeladoAire() {
		super();
		percentNitro=0;
		percentOxig=0;
		percentDioxDeCarb=0;
		percentVaporAgua=0;
		
	}
	
	public CongeladoAire(int percentNitro, int percentOxig, int percentDioxDeCarb, int percentVaporAgua, String informacion,
			int tempRecomendada, int numeroDeLote, Date fechaDeCapacidad, String paisOrigen, Date fecEnvasado) {
		
		super(informacion, tempRecomendada, numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
		this.percentNitro = percentNitro;
		this.percentOxig = percentOxig;
		this.percentDioxDeCarb = percentDioxDeCarb;
		this.percentVaporAgua = percentVaporAgua;
		
	}

	public int getPercentNitro() {
		return percentNitro;
	}

	public void setPercentNitro(int percentNitro) {
		this.percentNitro = percentNitro;
	}

	public int getPercentOxig() {
		return percentOxig;
	}

	public void setPercentOxig(int percentOxig) {
		this.percentOxig = percentOxig;
	}

	public int getPercentDioxDeCarb() {
		return percentDioxDeCarb;
	}

	public void setPercentDioxDeCarb(int percentDioxDeCarb) {
		this.percentDioxDeCarb = percentDioxDeCarb;
	}

	public int getPercentVaporAgua() {
		return percentVaporAgua;
	}

	public void setPercentVaporAgua(int percentVaporAgua) {
		this.percentVaporAgua = percentVaporAgua;
	}

	@Override
	public String toString() {
		return "CongeladoAire [percentNitro=" + percentNitro + ", percentOxig=" + percentOxig + ", percentDioxDeCarb="
				+ percentDioxDeCarb + ", percentVaporAgua=" + percentVaporAgua + ", tempRecomendada=" + tempRecomendada
				+ ", numeroDeLote=" + numeroDeLote + ", fechaDeCapacidad=" + fechaDeCapacidad + ", paisOrigen="
				+ paisOrigen + ", fecEnvasado=" + fecEnvasado + "]";
	}

	
	
	
	
	
}
