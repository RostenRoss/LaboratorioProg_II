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
public class Profesor extends Persona{
    
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
    
    public double calcularSueldo(){
        double porcentaje= (this.basico*10)/100;
        
        return this.basico+ (porcentaje*this.antiguedad);
    }

    @Override
    public String toString() {
        return "Profesor{" + "basico=" + basico + ", antiguedad=" + antiguedad + '}';
    }
    
    
}
