package tp7;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean terminar=false;
		do {
			Scanner sc=new Scanner(System.in);

			try {
				System.out.println("Ingrese un numero: ");
				int num=sc.nextInt();
				terminar=true;
				if (num%2==0) {
					System.out.println("Numero Par!");
				}else {
					System.out.println("Numero Impar!");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
			}
		}while(!terminar);	

	}

}
