/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8.interfaces;

/**
 *
 * @author Usuario
 */
public interface Vehiculo {
    public int VELOCIDAD_MAXIMA=120;   
    public void acelerar( int vel);
    public void  frenar( int fren);
    public int plazas();
}
