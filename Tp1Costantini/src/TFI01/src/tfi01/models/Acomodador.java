/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi01.models;

import tfi01.interfaces.ParaAcomodador;

/**
 *
 * @author Usuario
 */
public class Acomodador extends Empleado implements ParaAcomodador {
    private Sala sala;
    
    public Acomodador(String nombre, int edad) {
        super( nombre, edad);
    }
    
    @Override
    public Sala getSala() {
        return this.sala;
    }

    @Override
    public void setSala(Sala sala) {
        this.sala=sala;
    }

    @Override
    protected String getTipo() {
        return "Acomodador";
    }

    @Override
    public String toString() {
        return "[ "+super.toString()+", "+this.sala.toStrin(); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    
}
