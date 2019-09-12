package tp6;

public class Contrase�a {

	String contrase�a="";
	private int cantidadMin;
	private int cantidadMay;
	private int cantidadNum;

	public Contrase�a (int longitud) {
		for (int i = 0; i < longitud; i++) {
			this.contrase�a=contrase�a+generarContrase�a();
		}
		this.cantidadMay=mayusculas();
		this.cantidadMin=minusculas();
		this.cantidadNum=numeros();

		
	}
	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
	
	private char generarContrase�a() {
		String caracteres= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int numero = (int) (Math.random() * 61);
		char character= caracteres.charAt(numero);
		return character;
	}
	
	public String valorarContrase�a() {
		String retorno="Contrase�a debil";
		if (this.cantidadNum>4 && this.cantidadMin>1 && this.cantidadMay>2) {
			retorno="Contrase�a fuerte";
		}
		return retorno;
		
	}
	
	private int minusculas() {
		int min=0;
		char [] minusculas= {'a','b','c','d','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i = 0; i < this.contrase�a.length(); i++) {
			for (int j = 0; j < minusculas.length; j++) {
				if (minusculas[j] == contrase�a.charAt(i)) {
					min++;
				}
			}
		}
		return min;
	}
	
	private int mayusculas() {
		int may=0;
		char [] mayusculas= {'A','B','C','D','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for (int i = 0; i < this.contrase�a.length(); i++) {	
			for (int j = 0; j < mayusculas.length; j++) {
				if (mayusculas[j] == contrase�a.charAt(i)) {
					may++;
				}
			}
		}
		return may;
	}
	
	private int numeros() {
		int num=0;
		char [] numeros= {'1','2','3','4','5','6','7','8','9','0'};
		
		for (int i = 0; i < this.contrase�a.length(); i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[j] == contrase�a.charAt(i)) {
					num++;
				}
			}
				
		}
		return num;
	}
	
}
	

