/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Carrera implements Informacion{
    private String nombre;
    private Set<Materia> listaMaterias;

    public Carrera(String nombre){
        this.nombre=nombre;
        this.listaMaterias=new TreeSet<>();
    }
    @Override
    public int verCantidad() {
       return  listaMaterias.size();
    }

    @Override
    public String listaContenidos() {
        String listado="";
        Iterator<Materia> materiaIterador= listaMaterias.iterator();
        
        while(materiaIterador.hasNext()){
            listado +=materiaIterador.next().getNombre();
        }
        
        return listado;
    }
    
    public void agregarMateria(Materia materia){
        listaMaterias.add(materia);
    }
    
    public void eliminarMateria(String nombre){
         
        Iterator<Materia> materiaIterador= listaMaterias.iterator();
        while(materiaIterador.hasNext()){
            if (materiaIterador.next().getNombre().equals(nombre)) {
                materiaIterador.remove();
                break;
            }
            
        }
    }
    
    public void encontrarMateria(String nombre){
       Iterator<Materia> materiaIterador= listaMaterias.iterator();
        while(materiaIterador.hasNext()){
            if (materiaIterador.next().getNombre().equals(nombre)) {
                System.out.println("Materia encontrada!!");
                Scanner sc = new Scanner(System.in);
                int entrada;
                try {
                    System.out.println("Desea eliminarla??    1 si/ cialquier otro numero para no");
                    entrada= sc.nextInt();
                    if (entrada==1) {
                        materiaIterador.remove();
                    }
                } catch (Exception e) {
                    System.out.println("Alerta,Caracter invalido!!!");
                }
                
            }
        } 
    }

    public String getNombre() {
        return nombre;
    }
    
    public Set<Materia> getListaMaterias (){
        
        return this.listaMaterias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaMaterias(Set<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", listaMaterias=" + listaMaterias + '}';
    }
    
    
}
