package clase5.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente [] cuentas= new CuentaCorriente[10];
		for (int i = 0; i < cuentas.length; i++) {
			CuentaCorriente nuevaCuenta=new CuentaCorriente();
			cuentas[i]= nuevaCuenta;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("1: para extraer\n2: para depositar\n3: para transferir\n4: para mostrar saldo\n5: para mostrar nombre\n6: para mostrar cuenta\nCualquier otro numero para salir");
		int op=sc.nextInt();
		int cuenta;
		int cuenta2;
		switch (op) {
		
		case 1:
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta de la que extraera dinero.");
			cuenta=sc.nextInt();
			System.out.println("Ingrese el saldo a extraer: ");
			cuentas[cuenta].extraer(sc.nextDouble());
			break;
		case 2:
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta a la que depositara dinero.");
			cuenta=sc.nextInt();
			System.out.println("Ingrese el saldo a depositar: ");
			cuentas[cuenta].depositar(sc.nextDouble());
			break;
		case 3:
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta a la que depositara dinero.");
			cuenta=sc.nextInt();
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta depositante del dinero.");
			cuenta2=sc.nextInt();
			cuentas[cuenta2].transferencia(cuentas[cuenta]);
			break;
		case 4:
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta y mostrar su saldo.");
			cuenta=sc.nextInt();
			System.out.println("Saldo"+cuentas[cuenta].getSaldo());
			break;
		case 5:
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta y mostrar el titular.");
			cuenta=sc.nextInt();
			System.out.println("Titular"+cuentas[cuenta].getNombre());

			break;
		case 6:
			System.out.println("Ingrese un numero del 1 al 10 para seleccionar la cuenta y mostrar todos sus datos.");
			cuenta=sc.nextInt();
			System.out.println(cuentas[cuenta].toString());

			break;
		default:
			System.out.println("Fin de programa.");
			break;
		}
	}

}
