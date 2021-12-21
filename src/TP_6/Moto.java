package TP_6;

public class Moto implements Vehiculo {

    int velocidad;

    @Override
    public String frenar(int cuanto) {
        velocidad -= cuanto;
        return "La moto ha frenado y va ah "+velocidad+" Km/h.";
    }

    @Override
    public String acelerar(int cuanto) {
        String cadena = "";
        if (velocidad>VELOCIDAD_MAXIMA) {
            cadena = "Exceso de velocidad";
        }
        cadena += "La moto ha acelerado y va ha "+ velocidad + " Km/h";
        return cadena;
    }
    
    public int plazas(){
        return 2;
    }

}
