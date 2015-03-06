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
		lista.add(c);
		numeroDeCuentas++;
	}
	/**
	 * 
	 * @param c Objeto de tipo CuentaBancaria para quitarlo de la lista del objeto Banco
	 */
	public void removeCuenta(CuentaBancaria c){
		lista.remove(c);
	}
	/**
	 * 
	 * @return Devuelve la cuenta con mayor saldo
	 */
	public CuentaBancaria cuenaConMayorSaldo(){
		if(lista.size()>0){
			double mayorSaldo = lista.get(0).getSaldo();
			CuentaBancaria cuentaMayorSaldo=lista.get(0);
			for (CuentaBancaria cuentaBancaria : lista) {
				if(cuentaBancaria.getSaldo()>mayorSaldo){
					cuentaMayorSaldo=cuentaBancaria;
					mayorSaldo=cuentaBancaria.getSaldo();
				}
			}
			return cuentaMayorSaldo;
		} else {
			System.out.println("No hay cuentas");
			return null;
		}
	}
	/**
	 * 
	 * @return devuelve la cuenta con menor saldo
	 */
	public CuentaBancaria cuenaConMenorSaldo(){
		if(lista.size()>0){
			double menorSaldo = lista.get(0).getSaldo();
			CuentaBancaria cuentaMenorSaldo=lista.get(0);
			for (CuentaBancaria cuentaBancaria : lista) {
				if(cuentaBancaria.getSaldo()<menorSaldo){
					cuentaMenorSaldo=cuentaBancaria;
					menorSaldo=cuentaBancaria.getSaldo();
				}
			}
			return cuentaMenorSaldo;
		} else {
			System.out.println("No hay cuentas");
			return null;
		}
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
