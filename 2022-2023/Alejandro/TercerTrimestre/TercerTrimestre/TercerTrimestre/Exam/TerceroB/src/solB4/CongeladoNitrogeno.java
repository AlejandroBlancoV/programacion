package solB4;

import java.util.Date;

public class CongeladoNitrogeno extends Congelado{
	
	private String metodoEmpleado;
	private int tiempoExpNitro;
	
	public CongeladoNitrogeno() {
		super();
		metodoEmpleado="";
		tiempoExpNitro=0;
	}
	public CongeladoNitrogeno(String metodoEmpleado, int tiempoExpNitro, String informacion, int tempRecomendada, 
			int numeroDeLote, Date fechaDeCapacidad, String paisOrigen, Date fecEnvasado) {
		super(informacion, tempRecomendada, numeroDeLote, fechaDeCapacidad, paisOrigen, fecEnvasado);
		this.metodoEmpleado=metodoEmpleado;
		this.tiempoExpNitro=tiempoExpNitro;
	}
	
	public String getMetodoEmpleado() {
		return metodoEmpleado;
	}
	public void setMetodoEmpleado(String metodoEmpleado) {
		this.metodoEmpleado = metodoEmpleado;
	}
	public int getTiempoExpNitro() {
		return tiempoExpNitro;
	}
	public void setTiempoExpNitro(int tiempoExpNitro) {
		this.tiempoExpNitro = tiempoExpNitro;
	}
	
	@Override
	public String toString() {
		return "CongeladoNitrogeno [metodoEmpleado=" + metodoEmpleado + ", tiempoExpNitro=" + tiempoExpNitro
				+ ", tempRecomendada=" + tempRecomendada + ", numeroDeLote=" + numeroDeLote + ", fechaDeCapacidad="
				+ fechaDeCapacidad + ", paisOrigen=" + paisOrigen + ", fecEnvasado=" + fecEnvasado + "]";
	}
	
	
	
}
