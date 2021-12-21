package TP_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Alquiler {

    protected String nombre;
    protected long documento;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected int posicionAmarre;
    protected String barcoUsar;

    public Alquiler() {
    }

    public Alquiler(String nombre, long documento, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, String barcoUsar) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoUsar = barcoUsar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public String getBarcoUsar() {
        return barcoUsar;
    }

    public void setBarcoUsar(String barcoUsar) {
        this.barcoUsar = barcoUsar;
    }

    @Override
    public String toString() {
        return "Datos de el alquiler {" + "nombre: " + nombre + ", documento: " + documento + ", fechaAlquiler: "
                + "" + fechaAlquiler + ", fechaDevolucion: " + fechaDevolucion + ", posicionAmarre: " + posicionAmarre + ""
                + ", barcoUsar: " + barcoUsar + '}';
    }

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void creaAlquiler() {
        System.out.println("Ingresar el nombre del cliente");
        setNombre(leer.next());
        System.out.println("Ingrese el documento del cliente");
        setDocumento(leer.nextLong());
        System.out.println("Ingresar la fecha de alquiler");
        setFechaAlquiler(pasarFecha(leer.next()));
        System.out.println("Ingrese la fecha de devolución del barco");
        setFechaDevolucion(pasarFecha(leer.next()));
        System.out.println("Ingrese el número de amarre del barco");
        setPosicionAmarre(leer.nextInt());
        System.out.println("Ingrese el nombre del barco que se llevará");
        setBarcoUsar(leer.next());
    }

    public Date pasarFecha(String dia) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {
            fecha = formato.parse(dia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fecha;
    }
}
