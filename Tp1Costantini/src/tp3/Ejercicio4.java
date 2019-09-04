package tp3.com;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz=new int [3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=(int) (Math.random() * 100) + 1; //genera el numero aleatorio

			}
		}
		System.out.println("Matriz desordenada: ");
		for (int[] arreglo : matriz) {
			for (int numero : arreglo) {
				System.out.println(numero+" ");
			}
		}
		
		System.out.println("\n\nMatriz ordenada:");
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
			for (int numero: arreglo) {
				System.out.println(numero+" ");
			}
			System.out.println(" ");
		}
	}

}
