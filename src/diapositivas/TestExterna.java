package diapositivas;

import diapositivas.Externa.Interna;

public class TestExterna {
	public static void main(String[] args) {
		Externa ex = new Externa();
		System.out.println("Metodo estatico "+Externa.devuelveOtroDos());
		System.out.println("Clase interna estatica "+Externa.InternaEstatica.devuelveDos());
		System.out.println("Metodo no estatico "+ex.devuelveTres());
		//objeto de la clase interna
		Externa.Interna in = (ex).new Interna();
		System.out.println("Metodo dentro de una clase interna : "+in.devuelveCuatro());
		System.out.println("Clase dentro de un metodo : "+ex.metodoDeInstancia());
		new Externa();
	}
}

class Externa{
	public Externa(){
		System.out.println("Creada clase externa");
	}
	//metodo estatico que devuelve un 2
	public static int devuelveOtroDos(){
		return 2;
	}
	//clase interna estatica
	public static class InternaEstatica{
		public static int devuelveDos(){
			return 2;
		}
	}
	//metodo que devuelve un 3
	public int devuelveTres(){
		return 3;
	}
	//clase interna
	public class Interna{
		public int devuelveCuatro(){
			return 4;
		}
	}
	//metodo que contiene una clase
	public int metodoDeInstancia(){
		int x = 5;
		class Local{
			public int devuelveSeis(){
				return 6;
			}
		}
		Local l = new Local();
		return l.devuelveSeis()+x;
	}
	//bloque anonimo
	{
		System.out.println("Esto es un bloque anonimo de instancia");
		class LocalANivelDeBloque{
			public int devuelveCinco(){
				return 5;
			}
		}
		LocalANivelDeBloque l = new LocalANivelDeBloque();
		System.out.println(l.devuelveCinco());
	}
	static {
		System.out.println("Esto es un bloque anonimo de clase");
		class LocalANivelDeBloqueEstatico{
			private int seis = 6;
			public int devuelveSeis(){
				return this.seis;
			}
		}
		LocalANivelDeBloqueEstatico l = new LocalANivelDeBloqueEstatico();
		System.out.println(l.devuelveSeis());
	}
}