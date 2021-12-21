package TP_6;

public class Coche implements Vehiculo {

    int velocidad = 0;

    @Override
    public String frenar(int cuanto) {
        velocidad -= cuanto;
        return "El coche a frenado y va a: " + velocidad + " Km/h.";
    }

    @Override
    public String acelerar(int cuanto) {
        String cadena = "";
        velocidad += cuanto;
        if (velocidad > VELOCIDAD_MAXIMA) {
            cadena = "Exceso de velocidad";
        }

        cadena += "El coche ha acelerado y va " + velocidad + " Km/h.";
        return cadena;
    }
    
    public int plaza(){
        return 4;
    }

}
