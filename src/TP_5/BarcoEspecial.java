package TP_5;

import java.util.Date;
import java.util.Scanner;

public final class BarcoEspecial extends Barco {
    private int numeroVelero;
    private double cvMotor;
    private double cvPotencia;
    private int camarote;

    public BarcoEspecial() {
    }

    public BarcoEspecial(int numeroVelero, double cvMotor, double cvPotencia, int camarote, String numeroMatricula, int slora, Date diaFabricacion, String nombre, long documento, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, String barcoUsar) {
        super(numeroMatricula, slora, diaFabricacion, nombre, documento, fechaAlquiler, fechaDevolucion, posicionAmarre, barcoUsar);
        this.numeroVelero = numeroVelero;
        this.cvMotor = cvMotor;
        this.cvPotencia = cvPotencia;
        this.camarote = camarote;
    }

    public int getNumeroVelero() {
        return numeroVelero;
    }

    public void setNumeroVelero(int numeroVelero) {
        this.numeroVelero = numeroVelero;
    }

    public double getCvMotor() {
        return cvMotor;
    }

    public void setCvMotor(double cvMotor) {
        this.cvMotor = cvMotor;
    }

    public double getCvPotencia() {
        return cvPotencia;
    }

    public void setCvPotencia(double cvPotencia) {
        this.cvPotencia = cvPotencia;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nDatos de barco especial {" + " numeroVelero: " + numeroVelero + ", cvMotor: " + cvMotor + ", cvPotencia: "
                + "" + cvPotencia + ", camarote: " + camarote + '}' + ""
                + "\n El alquiler total del barco es: $" + precioEpecial() ;
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearEspeciales(){
        super.crearBarco();
        System.out.println("Ingrese los numeros de mastil de velero");
        setNumeroVelero(leer.nextInt());
        System.out.println("Ingrese la potencia en CV del barco");
        setCvMotor(leer.nextDouble());
        System.out.println("Ingrese la potencia en CV");
        setCvPotencia(leer.nextDouble());
        System.out.println("Ingrese los numero de camarote");
        setCamarote(leer.nextInt());
    }
    
    private double precioEpecial(){
        double precioBarco = super.alquiler();
        return precioBarco + getNumeroVelero() + getCvMotor() + getCvPotencia() + getCamarote();
    }
}

