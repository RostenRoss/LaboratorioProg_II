package tp6;

public class Contraseña {

	String contraseña="";
	private int cantidadMin;
	private int cantidadMay;
	private int cantidadNum;

	public Contraseña (int longitud) {
		for (int i = 0; i < longitud; i++) {
			this.contraseña=contraseña+generarContraseña();
		}
		this.cantidadMay=mayusculas();
		this.cantidadMin=minusculas();
		this.cantidadNum=numeros();

		
	}
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	public int getCantidadMin() {
		return cantidadMin;
	}
	public void setCantidadMin(int cantidadMin) {
		this.cantidadMin = cantidadMin;
	}
	public int getCantidadMay() {
		return cantidadMay;
	}
	public void setCantidadMay(int cantidadMay) {
		this.cantidadMay = cantidadMay;
	}
	public int getCantidadNum() {
		return cantidadNum;
	}
	public void setCantidadNum(int cantidadNum) {
		this.cantidadNum = cantidadNum;
	}
	
	private char generarContraseña() {
		String caracteres= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int numero = (int) (Math.random() * 61);
		char character= caracteres.charAt(numero);
		return character;
	}
	
	public String valorarContraseña() {
		String retorno="Contraseña debil";
		if (this.cantidadNum>4 && this.cantidadMin>1 && this.cantidadMay>2) {
			retorno="Contraseña fuerte";
		}
		return retorno;
		
	}
	
	private int minusculas() {
		int min=0;
		char [] minusculas= {'a','b','c','d','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i = 0; i < this.contraseña.length(); i++) {
			for (int j = 0; j < minusculas.length; j++) {
				if (minusculas[j] == contraseña.charAt(i)) {
					min++;
				}
			}
		}
		return min;
	}
	
	private int mayusculas() {
		int may=0;
		char [] mayusculas= {'A','B','C','D','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for (int i = 0; i < this.contraseña.length(); i++) {	
			for (int j = 0; j < mayusculas.length; j++) {
				if (mayusculas[j] == contraseña.charAt(i)) {
					may++;
				}
			}
		}
		return may;
	}
	
	private int numeros() {
		int num=0;
		char [] numeros= {'1','2','3','4','5','6','7','8','9','0'};
		
		for (int i = 0; i < this.contraseña.length(); i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[j] == contraseña.charAt(i)) {
					num++;
				}
			}
				
		}
		return num;
	}
	
}
	

