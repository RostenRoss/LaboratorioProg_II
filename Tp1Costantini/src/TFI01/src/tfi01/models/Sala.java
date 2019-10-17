/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi01.models;

/**
 *
 * @author Usuario
 */
public class Sala {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectador[] espectadores;

    public Sala(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        espectadores=new Espectador[capacidad];
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public void setPelicula (String pelicula){
        this.pelicula=pelicula;
    }
    
    public void setEspectadores(Espectador[] espectadores){
        if (espectadores.length>this.capacidad) {
            System.out.println("Error: Capacidad de sala exedida!!!");
        }else{
            this.espectadores=espectadores;
        }
    }
    
    public String getEspectadores(){
        String retorno="[ ";
        if (this.espectadores == null) {
            retorno="SIN ESPECTADORES CARGADOS";
        }else {
            
            for (Espectador espectador : espectadores) {
                if (espectadores[espectadores.length-1].equals(espectador)) {
                    retorno=retorno+espectador.toString()+"]";
                    break;
                }
                retorno=retorno+espectador.toString()+", ";
            }
        }
            
        return retorno;
    }
    
    public String toStrin(){
        return "[ Sala: "+this.nombre+", Pelicula: "+this.pelicula+", Capacidad: "+this.capacidad+
               "\nEspectadores: "+getEspectadores() +" ]";
    }
}
