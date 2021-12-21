package TP_4;


public class Circulo implements calculosFormas {

    private int radio;

    public Circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void area(double radio) {
        System.out.println("El area del circulo es: " + (PI() * (Math.pow(radio, 2))));
    }

    @Override
    public void perimetro(int base, int altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public double PI() {
        return Math.PI;
    }

    @Override
    public void perimetro(double radio) {
        System.out.println("El perimetro del circulo es: " + (2 * PI() * radio));
    }

    @Override
    public void area(int base, int altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
