package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Futbol {
	private String nombreEquipo;
	private static final String[] NOMBRE_JUGADORES={"portero","defensa1","defensa2","defensa3","defensa4",
		"centro1","centro2","centro3","delantero1","delantero2","delantero3"};
	private enum Puesto{
		PORTERO,DEFENSA,CENTRO,DELANTERO
	}
	@Override
	public String toString() {
		return "Futbol [nombreEquipo=" + nombreEquipo + "]";
	}
	public Futbol(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public class Entrenador{
		private String nombreEntrenador;
		private int experiencia;
		private Entrenador(String nombreEntrenador, int experiencia) {
			this.nombreEntrenador = nombreEntrenador;
			this.experiencia = experiencia;
		}
		@Override
		public String toString() {
			return "Entrenador [nombreEntrenador=" + nombreEntrenador
					+ ", experiencia=" + experiencia + "]";
		}
		
		
	}
	public class Jugador{
		private String nombreJugador;
		private Puesto puesto;
		private Jugador(String nombreJugador, Puesto puesto) {
			this.nombreJugador = nombreJugador;
			this.puesto = puesto;
		}
		@Override
		public String toString() {
			return "Jugador [nombreJugador=" + nombreJugador + ", puesto="
					+ puesto + "]";
		}
	}
	public Entrenador contratarEntrenador(String nombre, int experiencia){
		return new Entrenador(nombre,experiencia);
	}
	public List<Jugador> confecionarEquipo(){
		List<Jugador> plantilla = new ArrayList<Jugador>();
		plantilla.add(new Jugador(NOMBRE_JUGADORES[0], Puesto.PORTERO));
		for (int i = 0; i < 4; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i+1], Puesto.DEFENSA));
		}
		for (int i = 0; i < 3; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i+5], Puesto.CENTRO));
		}
		for (int i = 0; i < 3; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i+8], Puesto.DELANTERO));
		}
		return plantilla;
	}
	
}
