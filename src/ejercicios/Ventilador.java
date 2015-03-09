package ejercicios;
enum Estado {LENTO, MEDIO, RAPIDO };
public class Ventilador {
	private Estado velocidad;
	private boolean encendido;
	private double radioVentilador; //en centimetros
	private String color;
	
	public Ventilador(){
		velocidad = Estado.LENTO;
		encendido = false;
		radioVentilador = 50;
		color = "blanco";
	}

	@Override
	public String toString() {
		return "Ventilador [velocidad=" + velocidad + ", encendido="
				+ encendido + ", radioVentilador=" + radioVentilador
				+ ", color=" + color + "]";
	}

	public Estado getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Estado velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public double getRadioVentilador() {
		return radioVentilador;
	}

	public void setRadioVentilador(double radioVentilador) {
		this.radioVentilador = radioVentilador;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
