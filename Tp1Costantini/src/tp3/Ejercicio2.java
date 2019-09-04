package tp3.com;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz=new int [3][3]; //matriz donde se guardaran los numeros generados al azar
		
		for (int i = 0; i < matriz.length; i++) { //for para recorrer las filas
			for (int j = 0; j < matriz[i].length; j++) { //for para recorrer las columnas
				matriz[i][j]=(int) (Math.random() * 100) + 1; //guardamos en esa posicion un numero generado al azar
			}
		}
		
		for (int[] arreglo : matriz) {  //for each para la matriz
			for (int elemento : arreglo) { //for each para el arreglo de la matriz
				System.out.print(elemento+" "); //mostramos el elemento
			}
			System.out.println("");
		}
	}

}
