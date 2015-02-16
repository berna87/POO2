package diapositivas;

public class InstanciaEstatico {
	public final int CONSTANTE = 5; 
	public static final int CONSTANTE2 = 7;
	
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(10);
		System.out.println("Valor de la arista : "+c1.getArista());
		System.out.println("Numero de cuadrados : "+Cuadrado.getNumeroDeCuadrados());
		InstanciaEstatico iS = new InstanciaEstatico(); //para acceder a la constante es necesario crear un objeto de la misma clase
		System.out.println("Constante 1 : "+iS.CONSTANTE);
		System.out.println("Constante 2 : "+CONSTANTE2); //a la constante2 se puede acceder directamente
		System.out.println("Version 1 : "+iS.version1());//similar al caso de la constante con metodos
		System.out.println("Version 2 : "+version2());
		
	}
	public int version1(){ //metodo que devuelve un numero aleatorio de 0 a 100
		return (int)(Math.random()*100);
	}
	public static int version2(){ //mismo metodo pero estatico
		return (int)(Math.random()*100);
	}
}
class Cuadrado{
	private int arista;
	private static int numeroDeCuadrados = 0;
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroDeCuadrados++;
	}
	@Override
	public String toString() {
		return "Cuadrado [arista=" + arista + "]";
	}
	public int getArista() {
		return arista;
	}
	public static int getNumeroDeCuadrados() {
		return numeroDeCuadrados;
	}
	public int aristaPorDos(){
		return this.arista*=2;
	}

}