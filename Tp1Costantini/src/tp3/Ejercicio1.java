package tp3.com;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean repetido=false;//bandera
		int [] array=new int [100]; //arreglo con las 100 posiciones
		int numero;
		for (int i = 0; i < array.length; i++) { //ciclo for para recorrer el arreglo y rellenar en sus posiciones con los numeros

			do {//bucle while donde generamos el numero random tantas veces como sea necesaria hasta que de un numero no repetido
				numero=(int) (Math.random() * 100) + 1;//operacion matematica para generar el numero random
				for (int j = 0; j <= i; j++) { //bucle for encargado de recorrer el arreglo hasta la ultima posicion usada del arreglo, la cual es representada por "i"
					if (numero == array[j]) {//condicional que evalua la igualdad del valor random generado con el valor del arreglo en esa posicion "j".
						repetido=true; //se cambia la bandera si se encuentra.
					}
				}
				if(!repetido) { //en caso de ser falso el valor de la bandera, quiere desir que no se encontro numeros repetidos
					array[i]=numero; //entonces se guarda el numero generado
					repetido=true;//se cambia el valor de la bandera para que salga del ciclo DoWhile y el for principal pueda incrementar en 1 su valor.
				}else {
					repetido=false; //en caso contrario, es decir que sea true lo que quiere decor que se encontro un numero repetido
				}					//se cambia el valor de true a false, para no salir del ciclo DoWhile.
				
			}while(!repetido);//Usamos ciclo DoWhile ya que el primer numero sabemos que no es repetido por lo tanto la primera vez no se necesita forzar el
							 // ingreso al ciclo
		}
		System.out.println("Arreglo sin ordenar: ");
		for (int i : array) {    //recorremos el arreglo para mostrar sus valores
			System.out.print(i+" ");
		}
		System.out.println("\n\nArreglo ordenado: ");
		Arrays.sort(array); //ordenamos el arreglo haciendo uso de la librearia de Arrays y usando el metodo sort()
		for (int i : array) { //mostramos el arreglo, el cual fue ordenado en el paso anterior
			System.out.print(i+" ");
		}
	}

}
