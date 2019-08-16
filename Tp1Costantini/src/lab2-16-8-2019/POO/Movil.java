package POO;

public class Movil {
    private int tamPantalla;
    private int capacidad;
    private double precio;
    private int camara;
    private String tipo;
    private int stock;

    public  Movil(int tamPantalla,int capacidad,double precio,
                  int camara, String tipo, int stock){
        this.tamPantalla=tamPantalla;
        this.capacidad=capacidad;
        this.precio=precio;
        this.camara=camara;
        this.tipo=tipo;
        this.stock=stock;
    }


    public void vender(){
        this.stock--;
    }

    public void getStock(){
        System.out.println("El stock es de: "+this.stock);
    }

    public String getInfo() {
        return "Tamaño de pantalla: "+this.tamPantalla+"px \nCapacidad: "+this.capacidad+"Gb \nPrecio: "+this.precio+"$ \nCamara: "+this.camara+"px \nTipo: "+this.tipo+"\nStock: "+this.stock;
    }
}
