package tp3.com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][] matriz=new int [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println("Ingrese el numero: ");
				matriz[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matriz con los datos iniciales: ");
		for (int[] arreglo : matriz) {
			for (int numero : arreglo) {
				System.out.println(numero);
			}
			System.out.println(" ");
		}
		System.out.println("\n\nMatriz ordenada: ");
		for(int  i=0; i < matriz.length; i++){//ordena la matriz de abajo hacia arriba
	           for(int  j=0;j< matriz.length; j++){
	              for(int x = 0; x < matriz.length; x++){
	                  for(int y=0; y < matriz.length ; y++){
	                     if(matriz[i][j] < matriz[x][y]){
	                       int aux = matriz[i][j];
	                       matriz[i][j] = matriz[x][y];
	                       matriz[x][y] = aux;

	                     }
	                  }
	              }
	           }
		}
		for (int[] arreglo : matriz) {
			for (int numero : arreglo) {
				System.out.println(numero);
			}
			System.out.println(" ");
		}
	}

}
