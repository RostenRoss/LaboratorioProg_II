package tp7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Ingrese un numero: ");
			int num=sc.nextInt();
			if (num%2==0) {
				System.out.println("Numero Par!");
			}else {
				System.out.println("Numero Impar!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Caracter invalido!!");
		}
		
		
	}

}
