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
public class Facultad implements Informacion{
    private String nombre;
    private Set<Carrera> listaCarreras;
    
    public Facultad(String nombre){
        this.nombre=nombre;
        this.listaCarreras = new TreeSet<>();
    }

    @Override
    public int verCantidad() {
        return  listaCarreras.size();
    }

    @Override
    public String listaContenidos() {
        String listado="";
        Iterator<Carrera> carrerIterador= listaCarreras.iterator();
        
        while(carrerIterador.hasNext()){
            listado +=carrerIterador.next().getNombre();
        }
        
        return listado;
    }
    
    public void agregarCarrera(Carrera carrera){
        listaCarreras.add(carrera);
    }
    
    public void eliminarCarrear(String nombre){
        Iterator <Carrera> carreraIterador = listaCarreras.iterator();
        
        while(carreraIterador.hasNext()){
            if (carreraIterador.next().getNombre().equals(nombre)) {
                carreraIterador.remove();
            }
        }
    }
    
    public void eliminarEstudiante(Estudiante estudiante){ 
       
        for (Carrera carrera : listaCarreras) {
            
            for(Materia materia : carrera.getListaMaterias()){
                
                for(Estudiante estudiante2 : materia.getListaEstudiantes()){
                    
                    if (estudiante2.equals(estudiante)) {
                        materia.eliminarEstudiatne(estudiante2.getNombre());
                    }
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(Set<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public String toString() {
        return "Facultad{" + "nombre=" + nombre + ", listaCarreras=" + listaCarreras + '}';
    }
    
    
    
}
