package ejercicios;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Bernabe Fernandez Ogayar
 * @version 1.0
 *
 */
public class Banco {
	private List<CuentaBancaria> lista;
	private static int numeroDeCuentas=0;
	public Banco(){
		lista=new ArrayList<CuentaBancaria>();
	}
	/**
	 * 
	 * @param c Objeto de tipo CuentaBancaria para añadirlo a la lista del objeto Banco
	 */
	
	public void addCuenta(CuentaBancaria c){
		if (!lista.contains(c)){
			lista.add(c);
			numeroDeCuentas++;}
	}
	/**
	 * 
	 * @param c Objeto de tipo CuentaBancaria para quitarlo de la lista del objeto Banco
	 */
	public void removeCuenta(CuentaBancaria c){
		if (lista.contains(c)){
			lista.remove(c);
			numeroDeCuentas--;}
	}
	/**
	 * 
	 * @return Devuelve la cuenta con mayor saldo
	 */
	public List<CuentaBancaria> cuentaConMayorSaldo(){
		List<CuentaBancaria> list = new ArrayList<CuentaBancaria>();
		double mayorSaldo=0;
		for (CuentaBancaria cuentaBancaria : lista) {
			if(cuentaBancaria.getSaldo() > mayorSaldo) mayorSaldo = cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : lista) {
			if(cuentaBancaria.getSaldo()==mayorSaldo) list.add(cuentaBancaria);
		}
		return list;
	}
	/**
	 * 
	 * @return devuelve la cuenta con menor saldo
	 */
	public List<CuentaBancaria> cuentaConMenorSaldo(){
		List<CuentaBancaria> list = new ArrayList<CuentaBancaria>();
		double menorSaldo=Double.MAX_VALUE;
		for (CuentaBancaria cuentaBancaria : lista) {
			if(cuentaBancaria.getSaldo() < menorSaldo) menorSaldo = cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : lista) {
			if(cuentaBancaria.getSaldo()==menorSaldo) list.add(cuentaBancaria);
		}
		return list;
	}
	
	private double saldoMedio(){
		if(lista.size()>0){
			double suma = 0;
			for (CuentaBancaria cuentaBancaria : lista) {
				suma += cuentaBancaria.getSaldo();
			}
			return suma/numeroDeCuentas;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Numero de cuentas en el banco : "+numeroDeCuentas+"\nSaldo medio de las cuentas en el banco : "+saldoMedio();
	}
	
}
