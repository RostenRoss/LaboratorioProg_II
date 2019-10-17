/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfi01;

import tfi01.models.Acomodador;
import tfi01.models.Empleado;
import tfi01.models.Espectador;
import tfi01.models.Sala;

/**
 *
 * @author Usuario
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sala nuevaSala=new Sala(3,"Sala 01");
        nuevaSala.setPelicula("Jocker");
        
        System.out.println("***---------Espectadores---------***");
        Espectador[] nuevosEspectadores= new Espectador[nuevaSala.getCapacidad()];
        nuevosEspectadores=Menu.cargarEspectadores(nuevosEspectadores);
        try {
            nuevaSala.setEspectadores(nuevosEspectadores);
            System.out.println(nuevaSala.getEspectadores());

            System.out.println("**---------Acomodador---------**");
            Acomodador nuevoAcomodador = new Acomodador("pepe", 23);
            nuevoAcomodador.setSueldo(50000);
            nuevoAcomodador.setSala(nuevaSala);
            System.out.println(nuevoAcomodador.toString());

            System.out.println("*---------Empleado---------*");
            Empleado nuevoEmpleado = new Empleado("mario", 38);
            nuevoEmpleado.setSueldo(40000);
            System.out.println(nuevoEmpleado.toString());
        } catch (NullPointerException e) {
        }
                    
    }
    
}
