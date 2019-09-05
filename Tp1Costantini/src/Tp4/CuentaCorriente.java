package clase5.com;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class CuentaCorriente {
	private String nombre;
	private Double saldo;
	private Long id;
	public CuentaCorriente() {
		Random randomizar= new Random(System.nanoTime());
		id=randomizar.nextLong();
		nombre=asignarNombre();
		saldo=randomizar.nextDouble()*100;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Long  getId() {
		return id;
	}

	private String asignarNombre() {
		 byte[] array = new byte[7]; // length is bounded by 7
		 new Random().nextBytes(array);
		 String generatedString = new String(array, Charset.forName("UTF-8"));
		 return generatedString;
	}
	
	public void extraer(double cantidad) {
		if(saldo<cantidad) {
			System.out.println("El saldo poseido es menor al de la extracion!!");
		}else {
			System.out.println("Extracion exitosa!!");
			saldo -=cantidad;
			System.out.println("Saldo actual: "+saldo);
		}
	}
	
	public void depositar(double cantidad) {
		System.out.println("Deposito exitoso");
		saldo +=cantidad;
		System.out.println("Saldo actual: "+saldo);
	}
	public void transferencia(CuentaCorriente cuentaDepositada) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cantidad a depositar: ");
		Double deposito=sc.nextDouble();
		cuentaDepositada.depositar(deposito);
		this.extraer(deposito);
		System.out.println("La transferencia fue exitoso!!");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular: "+nombre+"\nID: "+id+"\nSaldo: "+saldo;
	}
	
	
}
