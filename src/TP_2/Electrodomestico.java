package TP_2;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio = 1000;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = 1000;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico: " + "precio = $" + precio + ", color = " + color + ", consumoEnergetico "
                + "= " + consumoEnergetico + ", peso = " + peso + ',';
    }

    private static char[] letras = {'A', 'B', 'C', 'D', 'E'};

    private char comprobarConsumoEnergetico(char letra) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                return letra;
            }
        }
        return 'F';
    }

    private static String[] colores = {"negro", "rojo", "azul", "gris"};

    private String comprobarColor(String color) {
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals(color)) {
                return color;
            }
        }
        return "blanco";
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color del electrodomestico");
        setColor(comprobarColor(leer.next().toLowerCase()));
        System.out.println("Ingrese el consumo energetico");
        setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0)));
        System.out.println("Ingrese el peso del electrodomestico");
        setPeso(leer.nextDouble());
        precioFinal();
    }
    
    private static String[][] precioSegunConsumo = {{"A","1000"},{"B","800"},{"C","600"},{"D","500"},{"E","300"},{"F","100"}};
    
    public void precioFinal(){
        for (int i = 0; i < precioSegunConsumo.length; i++) {
            if (precioSegunConsumo[i][0].charAt(0) == getConsumoEnergetico()) {
                setPrecio(getPrecio() + Integer.parseInt(precioSegunConsumo[i][1]) + precioSegunKilogramo());
            }
        }
    }
    
    private int precioSegunKilogramo(){
        if(getPeso() > 1 && getPrecio() < 20 )
            return 100;
        else if(getPeso() > 19 && getPeso() < 50)
            return 500;
        else if(getPeso() > 49 && getPeso() < 80)
            return 800;
        else 
            return 1000;                
    }
}
