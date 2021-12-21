package TP_2;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {

    private int pulgada;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgada, boolean tdt, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgada = pulgada;
        this.tdt = tdt;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return super.toString() + " pulgada de la TV: " + pulgada + ", tiene TDT: " + tieneTdt() + '}';
    }

    private String tieneTdt() {
        if (isTdt() == true) {
            return "si";
        } else {
            return "no";
        }
    }

    private Scanner leer = new Scanner(System.in);

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la pugada del televisor");
        setPulgada(leer.nextInt());
        System.out.println("¿Tiene TDT? - SI/NO ");
        TDT(leer.next().toUpperCase());
        if (getPulgada() > 39) {
            setPrecio(getPrecio() + (getPrecio() * 0.30));
        }
        if (isTdt() == true) {
            setPrecio(getPrecio() + 500);
        }

    }

    private void TDT(String tdt) {
        if (tdt.equals("SI")) {
            setTdt(true);
        } else {
            setTdt(false);
        }
    }
}
