/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi01;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;
import tfi01.models.Espectador;

/**
 *
 * @author Usuario
 */
public class Menu {
    
    public static Espectador crearEspectador(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la letra de la fila: ");
        String fila= sc.next();
         //silla=0;
        System.out.println("Ingrese el numero de silla: ");
        try {
            int silla=sc.nextInt();
            System.out.println("Ingrese el nombre del espectador: ");
            String nombre=sc.next();
            System.out.println("Ingrese la edad del espectador: ");
            int edad=sc.nextInt();
            Espectador nuevoEspectador= new Espectador(fila, silla, nombre, edad);
            return nuevoEspectador;
        } catch (Exception e) {
            System.out.println("ERROR EN EL INGRESO DE DATOS");
            return null;
        }
        
    }
    
    public static Espectador[] cargarEspectadores(Espectador[] espectadores){
        int ultimo=0;
        for (Espectador espectadore : espectadores) {
            if (espectadore != null) {
                ultimo++;
            }
        }
        boolean salir=false;
        while(!salir){
            System.out.println("------------- Cliente ------------ "+ultimo+"/"+espectadores.length);
            if (ultimo<espectadores.length) {
                Espectador espectador=crearEspectador();
                if (espectador == null) {
                    espectadores = null;
                    break;
                }else {
                    espectadores[ultimo]=crearEspectador();
                    ultimo++;
                }
            }else{
               salir=true;
           }
        }
        
        return espectadores;
    }
    
}
