package tp8;

public class Moto implements Vehiculo {
	int velocidad;
	int plaza=2;
	
	public Moto(int velocidad) {
		this.velocidad=velocidad;
	}
	
	@Override
	public String toString(){
		
		return "Plazas: "+this.plaza+", Velocidad ."+this.velocidad;
	}

	@Override
	public void frenar(int frenado) {
		// TODO Auto-generated method stub
		if (frenado+velocidad < 0) {
			velocidad=0;
			System.out.println("El vehiculo a frenado!!");
		}else {
			velocidad=velocidad-frenado;
		}
	}

	@Override
	public void acelerar(int acelerado) {
		// TODO Auto-generated method stub
		if (acelerado+velocidad > this.VELOCIDAD_MAXIMA) {
			velocidad=VELOCIDAD_MAXIMA;
			System.out.println("Velocidad maxima alcanzada!!");
		}else {
			velocidad=velocidad+acelerado;
		}
	}

	@Override
	public int getPlaza() {
		// TODO Auto-generated method stub
		return this.plaza;
	}
}
