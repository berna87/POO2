package diapositivas;

public class ReferenciaValor {
	public static void main(String[] args) {
		//pasando referencias a un objeto
		Circulo c1 = new Circulo(3.5);
		System.out.println("Posicion de memoria de c1 : "+c1);
		Circulo c3 = c1;
		c3.setRadio(10);
		System.out.println("Posicion de memoria de c3 : "+c3);
		System.out.println("Valor del radio de c3 : "+c3.getRadio());
		modificar(c1);
		System.out.println("Valor del radio de c1 : "+c1.getRadio());
		//pasando un dato primitivo a un objeto
		int inicial = 6;
		System.out.println("Valor de inicial antes de llamar al metodo : "+inicial);
		modificarPrimitivo(inicial);
		System.out.println("Valor de inicial despues de llamar al metodo : "+inicial);
	}
	public static void modificar(Circulo c2){
		System.out.println("Posicion de memoria de c2 : "+c2);
		c2.setRadio(15);
		System.out.println("Valor del radio de c2 : "+c2.getRadio());
	}
	public static void modificarPrimitivo(int valorEnElMetodo){
		valorEnElMetodo*=2;
	
	}
}

class Circulo{
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}