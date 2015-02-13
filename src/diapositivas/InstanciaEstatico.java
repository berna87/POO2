package diapositivas;

public class InstanciaEstatico {
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(10);
		System.out.println("Valor de la arista : "+c1.getArista());
		System.out.println("Numero de cuadrados : "+Cuadrado.getNumeroDeCuadrados());
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