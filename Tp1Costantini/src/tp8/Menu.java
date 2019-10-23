package tp8;

import java.util.Scanner;

public class Menu {

	public static Vehiculo crarVehiculo() {
		Scanner sc =new Scanner(System.in);
		System.out.println("1 para crar auto, 2 para crear moto.");
		int opcion=sc.nextInt();
		System.out.println("Ingrese la velocidad inicial: ");
		int velocidadInicial=sc.nextInt();
		if (opcion==1) {
			Vehiculo nuevoAuto= new Auto(velocidadInicial);
			return nuevoAuto;
		}
		Vehiculo nuevamoto= new Moto(velocidadInicial);
		return nuevamoto;
		
	}
	
	
	
	
	public static void opciones() {
		Scanner sc =new Scanner(System.in);
		boolean salir= false;
		while (!salir) {
			System.out.println("Si desea crear un movil ingrese 1.");
			System.out.println("Si desea listar los moviles ingrese 2.");
			int op=sc.nextInt();
			if (op==1) {
				for (int i = 0; i < Main.vehiculos.length; i++) {
					Main.vehiculos[i]=Menu.crarVehiculo();
				}
			}else if (op ==2) {
				System.out.println("Para listar autos ingrese 1");
				System.out.println("Para listar motos ingrese 2");
				op=sc.nextInt();
				if (op==1) {
					for (int i = 0; i < Main.vehiculos.length; i++) {
						if (Main.vehiculos[i].getClass().isInstance(new Auto(0))) {
							System.out.println(Main.vehiculos[i].toString()+", Posicion en arreglo : "+i);
						}
					}
				}else if(op==2) {
					for (int i = 0; i < Main.vehiculos.length; i++) {
						if (Main.vehiculos[i].getClass().isInstance(new Moto(0))) {
							System.out.println(Main.vehiculos[i].toString()+", Posicion en arreglo : "+i);
						}
					}
				}else {
					System.out.println("La opcion ingresada no es valida!!!");
				}
			}else {
				System.out.println("La opcion ingresada no es valida!!!");

			}
			
			System.out.println("0 salir, 1 continuar.");
			op=sc.nextInt();
			if (op==0) {
				salir=true;
			}
		}
		
	}
}
