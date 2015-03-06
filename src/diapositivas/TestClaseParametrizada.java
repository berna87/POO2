package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class TestClaseParametrizada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametrizada<Double> listaDouble = new Parametrizada<Double>();
		for (int i = 0; i < 10; i++) {
			listaDouble.addLista(new Double(i));
		}
		Double valor = listaDouble.devuelveObjetoPosicion((int) (Math.random()*10));
		System.out.println(valor);
		System.out.println(listaDouble.devuelveObjetoPosicion(11));
		Parametrizada<String> listaString = new Parametrizada<String>();
		for (int i = 0; i < 10; i++) {
			listaString.addLista(new String("Palabra "+i));
		}
		String valorS= listaString.devuelveObjetoPosicion((int) (Math.random()*10));
		System.out.println(valorS);
	}

}
class Parametrizada<T>{
	List<T> lista;
	public Parametrizada(){
		lista = new ArrayList<T>();
	}
	public void addLista(T t){
		this.lista.add(t);
	}
	public T devuelveObjetoPosicion(int i){
		if (i<this.lista.size()) return this.lista.get(i);
		else return null;
	}
	
}
 
