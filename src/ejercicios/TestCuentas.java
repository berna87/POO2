package ejercicios;

public class TestCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria c1 = new CuentaBancaria(1000, 3.2);
		CuentaBancaria c2 = new CuentaBancaria(1500, 4);
		CuentaBancaria c3 = new CuentaBancaria(800, 3.5);
		CuentaBancaria c4 = new CuentaBancaria();
		CuentaBancaria c5 = new CuentaBancaria();
		System.out.println("Cuenta 1 : "+c1);
		System.out.println("Cuenta 2 : "+c2);
		System.out.println("Cuenta 3 : "+c3);
		System.out.println("Cuenta 4 : "+c4);
		System.out.println("Cuenta 5 : "+c5);
		Banco b = new Banco();
		System.out.println("Estado inicial del objeto banco :\n"+b);
		b.addCuenta(c1); b.addCuenta(c2); b.addCuenta(c3);
		b.addCuenta(c4); b.addCuenta(c5);
		System.out.println("Cuenta con mayor saldo :\n"+b.cuentaConMayorSaldo());
		System.out.println("Cuenta con menor saldo :\n"+b.cuentaConMenorSaldo());
		System.out.println("Despues de añadir las cuentas :\n"+b);
	}

}
