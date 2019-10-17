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
public class Espectador extends Persona{
    
    private String fila;
    private int silla;

    public Espectador(String fila, int silla, String nombre, int edad) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public String getFila() {
        return fila;
    }

    public int getSilla() {
        return silla;
    }
      
    public String getButaca(){
        return "Fila: "+this.fila+", Silla: "+this.silla;
    }
    @Override
    protected String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {
        return "[Nombre: "+this.getNombre()+", Edad: "+this.getEdad()+
               ", "+this.getButaca()+"]";
    }
    
}
