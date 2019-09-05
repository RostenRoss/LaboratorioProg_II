package main.com;

import java.util.Scanner;

public class Facultad {
    private Long idEstudiantes = 1L;  //ID del alumno, se usa del tipo Long para poder tener id con valor null.
    private String nombreFacultad; //Nombre de la facultad
    private int maxAlumnos; //cantidad maxima de alumnos
    private Estudiante[] estudiantes; //arreglo de objetos del tipo Estudiantes
    private int ultimaPos=0;//variable de la ultima posicion donde se guarda la ultima posicion donde se guardo un alumno.
    private int ultimoBorrado;//se guarda la ultima posicion donde haya objetos no nulos.

    public Facultad(String nombre, int maxAlumnos){
        this.nombreFacultad=nombre;
        this.maxAlumnos=maxAlumnos;
        estudiantes=new Estudiante[maxAlumnos];
        this.ultimoBorrado=estudiantes.length-1;
    }

    
    
    public int getMaxAlumnos() {
		return maxAlumnos;
	}



	public void setMaxAlumnos(int maxAlumnos) {
		this.maxAlumnos = maxAlumnos;
	}



	public int getUltimaPos() {
		return ultimaPos;
	}



	public void setUltimaPos(int ultimaPos) {
		this.ultimaPos = ultimaPos;
	}



	public void agregarAlumno( Facultad facultad){ //Metodo que agrega alumnos a la lista de estudiantes de la facultad

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese nombre del estudiante: ");
        String nombre=entrada.next();
        System.out.println("Ingrese nota media: ");
        double notaMedia=entrada.nextDouble();
        Estudiante estudiante= new Estudiante(nombre, idEstudiantes, notaMedia, facultad);
        estudiantes[ultimaPos]=estudiante; //se guarda en la primera posicion libre.
        idEstudiantes++;
        ultimaPos++;// se actualiza la ultima posicion donde se guardo un alumno
    }
    

    public String getNombreFacultad() {
		return nombreFacultad;
	}



	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}



	public void listarAlumnos(){ //se lista los alumnos del arreglo hasta la ultima posicion donde haya elementos no nulos
        for ( int i=0;i<ultimaPos; i++) { //se usa ultimaPos para no acceder a elementos nulos dentro del arreglo y evitar el erro "null pointer"
               System.out.println(estudiantes[i].toString());
        }
    }

    public Integer buscarAlumno(String nombre){ //Metodo que busca por un nombre y devuelve la posicion del alumno.
    	Integer retorno=null; //se uza un Integer para poder inicializar en nulo y devolver nulo en caso de que no se encuentre el nombre.
        for (int i=0; i<ultimaPos;i++){ //se recorre hasta la ultima posicion donde se guardo un estudiante para no acceder a una posicion nula del arreglo.
            if(estudiantes[i].getNombre().equals( nombre)){//se usa el metodo equals para comprar los Strings ya que el == compara la posicion de memoria.
            	retorno= i;
            }
        }
        return  retorno;
    }
    public void borrarAlumno(Long id){//Borra un alumno del arreglo
    	Integer encontrado=null;
        for (int i=0; i< ultimaPos;i++){ //recorre el arreglo hata la ultima posicion no nula.
            if (estudiantes[i].getNrEstudiante().equals(id)){//compara si el id es el mismo 
                estudiantes[i]= null; //se pone a nulo esa posicion de memoria
                encontrado=i; //se guarda la posicion donde estaba el alumno para usarla en el proximo ciclo for
                break;
            }
        }
        if (encontrado!=null) { //si encontrado es distinto de null quiere decir que se encontro un alumno
            for(int i=encontrado;i<ultimaPos-1;i++) {//si se encontro, este ciclo lo que hace es mover todos los demas alumnos una posicion antes
            	estudiantes[i]=estudiantes[i+1];
            	if(i==ultimaPos-1) {
            		estudiantes[ultimoBorrado-1]=null;
            	}
            }
            ultimaPos--;//se actualiza la ultiam posicion donde hay un alumno.
            
		}
        
    }

    public void modificarNotaMedia(String nombre, double nota){ // el metodo busca un alumno por nombre y modifica la nota media.

        for (int i=0; i<ultimaPos;i++){
            if (estudiantes[i].getNombre().equals(nombre)){
                estudiantes[i].setNotaMedia(nota);
            }
        }
    }
    
}
