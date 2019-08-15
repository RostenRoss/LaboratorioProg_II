package tp1.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;
		String nombre;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Por favor ingrese su nombre: ");
			nombre=sc.next();
			System.out.println("Por favor ingrese su edad");
			edad=sc.nextInt();
			if (edad>17) {
				System.out.println(nombre+" es mayor de edad");
			}else {
				System.out.println(nombre+" es menor de edad");
			}
		}while(edad!=0);
	}

}
