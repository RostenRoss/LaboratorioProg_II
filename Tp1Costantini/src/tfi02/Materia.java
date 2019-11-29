/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private Set<Estudiante> listaEstudiantes;
    
    public Materia(String nombre, Profesor titular){
        this.nombre=nombre;
        this.titular=titular;
        this.listaEstudiantes=new TreeSet<>();
    }
            
    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    
    public void eliminarEstudiatne(String nombre){
        
        Iterator<Estudiante> estudianteIterador= listaEstudiantes.iterator();
        while(estudianteIterador.hasNext()){
            if (estudianteIterador.next().getNombre().equals(nombre)) {
                estudianteIterador.remove();
                break;
            }
            
        }
        
    }
        
    public void modificarTitular(Profesor nuevoTitular){
        this.titular=nuevoTitular;
    }

    @Override
    public int verCantidad() {
        return listaEstudiantes.size();
    }

    
    @Override
    public String listaContenidos() {
        String listado="";
        Iterator<Estudiante> estudianteIterador= listaEstudiantes.iterator();
        
        while(estudianteIterador.hasNext()){
            listado +=estudianteIterador.next().getApellido();
        }
        
        return listado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
   
    public Set<Estudiante> getListaEstudiantes(){
        return this.listaEstudiantes;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", titular=" + titular + ", listaEstudiantes=" + listaEstudiantes + '}';
    }
          
}
