package TP_2;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " carga de la lavadora: " + carga + '.';
    }

    private Scanner leer = new Scanner(System.in);

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        setCarga(leer.nextInt());
        if (getCarga() > 29) {
            setPrecio(getPrecio() + 500);
        }
    }
}
