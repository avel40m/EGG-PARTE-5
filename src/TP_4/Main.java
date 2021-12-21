package TP_4;

public class Main {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRadio(2);
        c.area(c.getRadio());
        c.perimetro(c.getRadio());
        
        Rectangulo r = new Rectangulo(2,4);
        r.area(r.getBase(), r.getAltura());
        r.perimetro(r.getBase(), r.getAltura());
    }
    
}
