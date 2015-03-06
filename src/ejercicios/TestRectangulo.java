package ejercicios;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(3.2,4.4);
		Rectangulo r3 = new Rectangulo(4.3,5.8);
		System.out.println("Area : "+r1.getArea());
		System.out.println("Perimetro : "+r2.getPerimetro());
		System.out.println("Numero Rectangulos : "+Rectangulo.getNumRectangulos());
		System.out.println("Numero Rectangulos2 : "+Rectangulo.RectInterno.getNumRectangulos2());
	}

}
