package tp3.com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese en numero la cantidad de personas: ");
		int columnas=sc.nextInt();
		String [][] datosPersonas=new String [3][columnas];
		
		for (int i = 0; i < datosPersonas[0].length; i++) {
			System.out.println("Ingrese el nombre: ");
			datosPersonas[0][i]=sc.next();
			System.out.println("Ingrese el dni: ");
			datosPersonas[1][i]=sc.next();
			System.out.println("Ingrese la edad: ");
			datosPersonas[2][i]=sc.next();
		}
		String aux;
		for(int i=1;i < columnas;i++){

            for (int j=0 ; j <columnas- 1; j++){
            	if (datosPersonas[0][j].compareToIgnoreCase(datosPersonas[0][j + 1]) > 0) {
            		
                    aux = datosPersonas[0][j];
                    datosPersonas[0][j] = datosPersonas[0][j + 1];
                    datosPersonas[0][j + 1] = aux;
                    //
                    aux = datosPersonas[1][j];
                    datosPersonas[1][j] = datosPersonas[1][j + 1];
                    datosPersonas[1][j + 1] = aux;
                    //
                    aux = datosPersonas[2][j];
                    datosPersonas[2][j] = datosPersonas[2][j + 1];
                    datosPersonas[2][j + 1] = aux;
                    
                }	
                	
                
            }
        }
		 for (int i = 0; i < datosPersonas[0].length; i++) {
			 
			System.out.println(datosPersonas[0][i]);
		}
	}

}
