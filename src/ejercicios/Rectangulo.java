package ejercicios;

public class Rectangulo {
	private double ancho;
	private double alto;
	private static int numeroRectangulos=0;
	public Rectangulo(){
		ancho=1;
		alto=1;
		numeroRectangulos++;
	}
	public Rectangulo(double an, double al){
		ancho=an;
		alto=al;
		numeroRectangulos++;
	}
	public double getArea(){
		return ancho*alto;
	}
	public double getPerimetro(){
		return 2*ancho+2*alto;
	}
	public static int getNumRectangulos(){
		return numeroRectangulos;
	}
	public static class RectInterno{
		public static int getNumRectangulos2(){
			return numeroRectangulos;
		}
	}

}
