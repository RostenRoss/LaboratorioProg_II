package tp2.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] numeros= new int[10];
		int [] valores= {0,0,0};
		int key, acumulador=0;
		System.out.println("Seleccione segun desee ejecutar:");
		System.out.println("   *Ejercicio 1: precione el numero 1. \n   *Ejercicio 2: precione el numero 2. \n   *Para salir: precione cualquier numero.");
		key=sc.nextInt();
		switch (key) {
		case 1:
			 for(int i=0;i<10;i++) {
				 System.out.println("Ingrese un numero por favor: ");
				 numeros[i]=sc.nextInt();
				 if(numeros[i]>0) {
					 valores[0]++;
				 }else if(numeros[2]<0) {
					 valores[1]++;
				 }else {
					 valores[2]++;
				 }
			 }
			 System.out.println("La cantidad de numeros negativos es "+valores[1]+"\nLa cantidad de numeros positivos son "+valores[2]+"\nLa cantidad de valores iguales a cero es "+valores[3]);
			break;
		case 2:
			for (int i = 0; i < 10; i++) {
				 System.out.println("Ingrese un numero por favor: ");
				 numeros[i]=sc.nextInt();
			}
			System.out.println("aqui");
			for (int i=1;i<10;i=i+2) {
				acumulador=acumulador+numeros[i];
				System.out.println("aca: "+acumulador);
			}
			double media=acumulador/5;
			System.out.println("La media de las posiciones pares es: "+media);
			break;
		default:
			break;
		}
	}

}
