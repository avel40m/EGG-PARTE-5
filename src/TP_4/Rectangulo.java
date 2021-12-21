package TP_4;

public final class Rectangulo implements calculosFormas {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void area(double radio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void perimetro(int base, int altura) {
        System.out.println("El perimetro del rectangulo es: " + (base + altura * (2)) + " mt2");
    }

    @Override
    public void perimetro(double radio) {

    }

    @Override
    public double PI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void area(int base, int altura) {
        System.out.println("El area del rectangulo es " + (base * altura) + " mt2");
    }

}
