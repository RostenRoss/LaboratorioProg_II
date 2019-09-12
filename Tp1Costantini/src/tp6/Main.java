package tp6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de contraseñas a generar: ");
		int cant=sc.nextInt();
		System.out.println("Ingrese la longitud de las contraseñas: ");
		int longitud=sc.nextInt();
		Contraseña[] contraseñas=new Contraseña[cant];
		
		for (int i = 0; i < contraseñas.length; i++) {
			Contraseña nuevaContraseña=new Contraseña(longitud);
			contraseñas[i]=nuevaContraseña;
		}
		
		for (Contraseña contraseña : contraseñas) {
			System.out.println("Contraseña: "+contraseña.getContraseña()+" es "+contraseña.valorarContraseña()+
					", la cantidad de minusculas: "+contraseña.getCantidadMin()+", la cantidad de mayusculas: "+contraseña.getCantidadMay()
					+", la cantidad de numeros: "+contraseña.getCantidadNum());
			
		}

	}

}
