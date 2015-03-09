package ejercicios;

import java.time.LocalDate;
/**
 * 
 * @author Bernabe Fernandez Ogayar
 * @version 1.0
 *
 */
public class CuentaBancaria {
	private String numeroDeCuenta;
	private double saldo;
	private double interes;
	private LocalDate fechaCreacion;
	private static int numeroCuentasCreadas=0;
	/**
	 * Constructor por defecto que inicializa saldo a 0, interes a 2.5, 
	 * guarda fecha de creacion actual y genera el numero de cuenta
	 */
	public CuentaBancaria(){
		saldo=0;
		interes=2.5;
		fechaCreacion=LocalDate.now();
		new Cuenta().generarNumeroCuenta();
		numeroCuentasCreadas++;
	}
	/**
	 * 
	 * @param deposito Saldo inicial de la cuenta bancaria
	 * @param interes Interes indicado por parametros
	 */
	public CuentaBancaria(double deposito, double interes){
		saldo=deposito;
		this.interes=interes;
		fechaCreacion=LocalDate.now();
		new Cuenta().generarNumeroCuenta();
		numeroCuentasCreadas++;
	} 
	/**
	 * @return Devuelve el numero de cuenta
	 */
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	/**
	 * 
	 * @param numeroDeCuenta Para modificar el numero de cuenta
	 */
	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	/**
	 * 
	 * @return Devuelve el saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * 
	 * @param saldo Para sobreescribir el saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * 
	 * @return El interes actual de la cuenta
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * 
	 * @param interes Para sobreescribir el interes de la cuenta
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}
	/**
	 * 
	 * @return Fecha de creacion de la cuenta
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * 
	 * @param fechaCreacion Para sobreescribir la fecha de creacion
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * 
	 * @param cantidad Para sumar una cantidad al saldo actual
	 */
	public void depositarDinero(double cantidad){
		saldo += cantidad;
	}
	/**
	 * 
	 * @param cantidad Para restar una cantidad al saldo actual
	 */
	public void retirarDinero(double cantidad){
		if(cantidad <= saldo) saldo -= cantidad;
		else System.out.println("Saldo insuficiente");
	}
	
	@Override
	public String toString() {
		return "Numero de Cuenta : "+numeroDeCuenta+" Saldo : "+saldo +"\nFecha creacion : "+fechaCreacion;
	}

	private class Cuenta{
		private String numeroPersonal;
		private final String ENTIDAD = "1234";
		private final String BANCO = "5678";
		
		public Cuenta(){
			numeroPersonal=generarNumeroPersonal();
		}
		private int generarPrimerDigitoControl(){
			int digito1 = 0;	
			digito1 += Integer.parseInt(ENTIDAD.substring(0,1))*4;
			digito1 += Integer.parseInt(ENTIDAD.substring(1,2))*8;
			digito1 += Integer.parseInt(ENTIDAD.substring(2,3))*5;
			digito1 += Integer.parseInt(ENTIDAD.substring(3))*10;
			digito1 += Integer.parseInt(BANCO.substring(0,1))*9;
			digito1 += Integer.parseInt(BANCO.substring(1,2))*7;
			digito1 += Integer.parseInt(BANCO.substring(2,3))*3;
			digito1 += Integer.parseInt(BANCO.substring(3))*6;
			int resta = 11 - (digito1 % 11);
			if(resta == 10) return 1;
			if(resta == 11) return 0;
			return resta;	
		}
		private int generarSegundoDigitoControl(){
			int digito2 = 0;
			digito2 += Integer.parseInt(numeroPersonal.substring(0,1))*1;
			digito2 += Integer.parseInt(numeroPersonal.substring(1,2))*2;
			digito2 += Integer.parseInt(numeroPersonal.substring(2,3))*4;
			digito2 += Integer.parseInt(numeroPersonal.substring(3,4))*8;
			digito2 += Integer.parseInt(numeroPersonal.substring(4,5))*5;
			digito2 += Integer.parseInt(numeroPersonal.substring(5,6))*10;
			digito2 += Integer.parseInt(numeroPersonal.substring(6,7))*9;
			digito2 += Integer.parseInt(numeroPersonal.substring(7,8))*7;
			digito2 += Integer.parseInt(numeroPersonal.substring(8,9))*3;
			digito2 += Integer.parseInt(numeroPersonal.substring(9))*6;
			int resta = 11 - (digito2 % 11);
			if(resta == 10) return 1;
			if(resta == 11) return 0;
			return resta;	
		}
		private String generarNumeroPersonal(){
			String nPersonal = "";
			for (int i = 0; i < 10; i++) {
				nPersonal+=(int)(Math.random()*10);
			}
			return nPersonal;
		}
		private void generarNumeroCuenta(){
			String nCuenta="";
			nCuenta+=ENTIDAD+"-";
			nCuenta+=BANCO+"-";
			nCuenta+=generarPrimerDigitoControl();
			nCuenta+=generarSegundoDigitoControl()+"-";
			nCuenta+=numeroPersonal;
			numeroDeCuenta=nCuenta;	
		}
	}
	
/*	public static void main(String[] args) {
		CuentaBancaria c = new CuentaBancaria();
		System.out.println(c);
		
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroDeCuenta == null) ? 0 : numeroDeCuenta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		if (numeroDeCuenta == null) {
			if (other.numeroDeCuenta != null)
				return false;
		} else if (!numeroDeCuenta.equals(other.numeroDeCuenta))
			return false;
		return true;
	}
}
