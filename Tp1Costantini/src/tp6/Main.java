package tp6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de contrase�as a generar: ");
		int cant=sc.nextInt();
		System.out.println("Ingrese la longitud de las contrase�as: ");
		int longitud=sc.nextInt();
		Contrase�a[] contrase�as=new Contrase�a[cant];
		
		for (int i = 0; i < contrase�as.length; i++) {
			Contrase�a nuevaContrase�a=new Contrase�a(longitud);
			contrase�as[i]=nuevaContrase�a;
		}
		
		for (Contrase�a contrase�a : contrase�as) {
			System.out.println("Contrase�a: "+contrase�a.getContrase�a()+" es "+contrase�a.valorarContrase�a()+
					", la cantidad de minusculas: "+contrase�a.getCantidadMin()+", la cantidad de mayusculas: "+contrase�a.getCantidadMay()
					+", la cantidad de numeros: "+contrase�a.getCantidadNum());
			
		}

	}

}
