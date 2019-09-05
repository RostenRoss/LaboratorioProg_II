package main.com;

import java.util.Scanner;
//					INTEGRANtES
//			Costantini nestor matias
//			Maria cristina Roma
//			Kosobucki mauricio nicolas
public class UsoFacultad {
    public static void main(String[] args){
    	Scanner entrada= new Scanner(System.in);
    	//Se instancias las diferencias facultades, con sus nombres y cantidad de alumnos maximos.
        Facultad informatica= new Facultad("Ingenieria", 6);
        Facultad humanidades= new Facultad("Ingenieria", 30);
        Facultad artes= new Facultad("Ingenieria", 10);

        //Se agregan alumnos a la facultad de informatica.
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        
        //listamos los alumnos agregados.
        informatica.listarAlumnos();
        
        //Buscamos alumnos por nombre
        System.out.println("Ingrese el nombre a buscar en la facultad de informatica: ");
        String nombre= entrada.next();
        if (informatica.buscarAlumno(nombre)!=null) {
        	System.out.println("El alumno buscado esta en la posicion: "+informatica.buscarAlumno(nombre));
		}else {
			System.out.println("El alumno buscado no existe en la facultad de informatica!!");
		}
        
        //Eliminamos el alumno segun su ID
        System.out.println("Ingrese el id del alumno a eliminar de la facultad de informatica: ");
        informatica.borrarAlumno(entrada.nextLong());
        
        //Se lista para mostrar el alumnos eliminado
        informatica.listarAlumnos();
        
      //Eliminamos el alumno segun su ID
        System.out.println("Ingrese el id del alumno a eliminar de la facultad de informatica: ");
        informatica.borrarAlumno(entrada.nextLong());
        
        //Se lista para mostrar el alumnos eliminado
        informatica.listarAlumnos();
        
        //se modifica la nota de un alumno que se lo encuentra segund el nombre
        System.out.println("Modificar nota: Ingrese el nombre del alumno :");
        String nomb=entrada.next();
        System.out.println("Ingrese la nota :");
        informatica.modificarNotaMedia(nomb, entrada.nextDouble());
        
        //Se lista los alumnos para visualizar el cambio de la nota
        informatica.listarAlumnos();


    }
}
