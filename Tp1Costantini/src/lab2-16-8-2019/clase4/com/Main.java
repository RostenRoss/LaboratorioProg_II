package clase4.com;

import POO.Movil;

public class Main {
    public static void main (String [] args){
        Movil celular1= new Movil(13,16,16000.500,
                8, "Samsung A30",50);
        celular1.getStock();
        celular1.vender();
        celular1.getStock();
        System.out.println(celular1.getInfo());

    }
}
