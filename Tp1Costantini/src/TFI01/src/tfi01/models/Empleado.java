/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi01.models;

import tfi01.abstractsClass.Persona;

/**
 *
 * @author Usuario
 */
public class Empleado extends  Persona {
    private double sueldo;

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
     public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
     
    @Override
    protected String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "[Nombre: "+this.getNombre()+", Edad: "+this.getEdad()+
                ", Sueldo:"+this.sueldo+"]";
    }
    
}
