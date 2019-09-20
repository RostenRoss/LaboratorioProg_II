package tp7;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1  y 100: ");
		num=sc.nextInt();
		
		try {
			Range(num);
		} catch (OutRangeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void Range(int numero) throws OutRangeException{
		if (numero<1 || numero>100) {
			throw new OutRangeException("Error: Fuera de rango!!!");
		}else {
			System.out.println("El numero ingresado es correcto!!");
		}
	}

}
