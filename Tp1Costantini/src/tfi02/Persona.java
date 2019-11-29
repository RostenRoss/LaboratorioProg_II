/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi02;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;
    
    public Persona(String nombre, String apellido, int legajo){
        this.nombre=nombre;
        this.legajo=legajo;
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

 

    public int getLegajo() {
        return legajo;
    }

    
    public void modificarDatos (String nombre, String apellido, int legajo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.legajo=legajo;        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + '}';
    }
    
    
    
}
