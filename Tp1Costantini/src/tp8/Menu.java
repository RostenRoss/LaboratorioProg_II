/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import java.util.Scanner;
import tp8.interfaces.Vehiculo;

/**
 *
 * @author Usuario
 */
public class Menu {

    public static void crearMovhil() {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Seleccione una opcion:");
        System.out.println("    1):Para crear un auto.");
        System.out.println("    2):Para crear una moto.");
        op=sc.nextInt();
    	System.out.println("posicion: "+Tp8.pos);

        if(Tp8.pos>9){
            System.out.println("Limite de memoria RAM superado, compra mas memoria!!");
        }else {
        	System.out.println("posicion: "+Tp8.pos);
            switch (op) {
                case 1:
                    System.out.println("Ingrese la veloidad inicial del auto:");
                    Tp8.vehiculos[Tp8.pos] = new Coche(sc.nextInt());
                    Tp8.pos++;
                    break;
                case 2:
                    System.out.println("Ingrese la veloidad inicial de la moto:");
                    Tp8.vehiculos[Tp8.pos] = new Moto(sc.nextInt());
                    Tp8.pos++;
                    break;
                default:
                    System.out.println("La opcione ingresada no es valida!!");
            }
        }
    }

    public static void listar() {
        int pos=1;
        for (Vehiculo vehiculo : Tp8.vehiculos) {
            System.out.println("Movhil "+pos+": "+vehiculo.toString());
            pos++;
        }
    }

    public static int menuAcelerar(int pos) { //retorna 0 si no hace nada y retorna 1 si acelero
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion:");
        System.out.println("    1):Para acelerar.");
        System.out.println("    2):Para salir.");
        int op =sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingrese la veloidad :");
                int velocidad =sc.nextInt();
                Tp8.vehiculos[pos].acelerar(velocidad);
                op= 1;
                break;
            default:
                System.out.println("La opcione ingresada no es valida!!");
                op=0;
                break;
        }
        return op;
    }

    public static int menuFrenar(int pos) { //retorna 1 si frena y retorna 0 si no hace nada
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Seleccione una opcion:");
        System.out.println("    1):Para frenar.");
        System.out.println("    2):Para salir.");

        switch (op) {
            case 1:
                System.out.println("Ingrese la veloidad :");
                Tp8.vehiculos[pos].frenar(sc.nextInt());
                op= 1;
                break;
           
            default:
                System.out.println("La opcione ingresada no es valida!!");
                op=0;
                break;
        }
        return op;
    }
    public static void menuAcelerarOfrenar(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion del vehiculo que desea usar:");
        int pos =sc.nextInt();
        System.out.println("    1) Si desea acelerar.");
        System.out.println("    2) Si desea frenar.");
        int op=sc.nextInt();
        switch(op){
            case 1: Menu.menuAcelerar(pos-1);
                    break;
            case 2: Menu.menuFrenar(pos-1);
                    break;
            default: System.out.println("La opcion no es valida!!");
        }
    }
    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int op=0;
        
        while(op<1){
        	if(Tp8.pos<10) {
	        	for (int i = 0; i < 10; i++) {
	                Menu.crearMovhil();
				}
        	}
            Menu.menuAcelerarOfrenar();
            Menu.listar();
        }
    }
}
