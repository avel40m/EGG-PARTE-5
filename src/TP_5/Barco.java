package TP_5;

import java.util.Date;
import java.util.Scanner;

public class Barco extends Alquiler {
    
    protected String numeroMatricula;
    protected int slora;
    protected Date diaFabricacion;
    
    public Barco() {
    }
    
    public Barco(String numeroMatricula, int slora, Date diaFabricacion, String nombre, long documento, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, String barcoUsar) {
        super(nombre, documento, fechaAlquiler, fechaDevolucion, posicionAmarre, barcoUsar);
        this.numeroMatricula = numeroMatricula;
        this.slora = slora;
        this.diaFabricacion = diaFabricacion;
    }
    
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    public int getSlora() {
        return slora;
    }
    
    public void setSlora(int slora) {
        this.slora = slora;
    }
    
    public Date getDiaFabricacion() {
        return diaFabricacion;
    }
    
    public void setDiaFabricacion(Date diaFabricacion) {
        this.diaFabricacion = diaFabricacion;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nDatos del barco {" + "numeroMatricula: " + numeroMatricula + ", slora: "
                + "" + slora + ", diaFabricacion: " + diaFabricacion + '}' + "\n El alquiler del barco es: $"+alquiler();
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearBarco() {
        super.creaAlquiler();
        System.out.println("Ingrese el número de la matricula");
        setNumeroMatricula(leer.next());
        System.out.println("Ingrese el número de la slora en metro");
        setSlora(leer.nextInt());
        System.out.println("Ingrese la facha de fabricacion del barco");
        setDiaFabricacion(pasarFecha(leer.next()));
    }
    
    public double alquiler(){
        long diferencia = getFechaDevolucion().getTime() - getFechaAlquiler().getTime();
        return Math.floor(diferencia / 86400000 * (getSlora() * 10));
    }
}
