/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import tp8.interfaces.Vehiculo;

/**
 *
 * @author Usuario
 */
public class Moto implements Vehiculo{
    private int velocidad;
    public Moto(int vel){
        this.velocidad=vel;
    }
    public int getVelocidad() {
       return velocidad;
    }
         
    @Override
    public void acelerar(int vel) {
        
        if((this.velocidad+vel)>this.VELOCIDAD_MAXIMA){
            this.velocidad=120;
            System.out.println("No se puede acelerar mas, limite alcanzado!!");
        }else{
            this.velocidad=velocidad+vel;
        }
        
    }

    @Override
    public void frenar(int fren) {
        if((this.velocidad-fren)<0){
            this.velocidad=0;
            System.out.println("La moto ha frenado!!");
        }else{
            this.velocidad=velocidad-fren;
        }
        
    }

    @Override
    public int plazas() {
        return 2;
    }
    
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Velocidad: "+this.velocidad+", Plazas: "+this.plazas();
	}
    
}
