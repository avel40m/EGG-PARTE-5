package TP_6;

public interface Vehiculo {
    int VELOCIDAD_MAXIMA = 120;
    
    String frenar(int cuanto);
    String acelerar(int cuanto);
}
