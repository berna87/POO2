package ejercicios;

import java.util.List;

import ejercicios.Futbol.Jugador;

public class TestFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Futbol f = new Futbol("FC ejemplo");
		Futbol.Entrenador e = f.contratarEntrenador("Pepe", 5);
		System.out.println(e);
		List<Jugador> plantilla = f.confecionarEquipo();
		System.out.println(plantilla);
	}

}
