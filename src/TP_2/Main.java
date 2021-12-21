package TP_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        double sumar = 0;
        
        Televisor t = new Televisor();
        t.crearTelevisor();
        Televisor t1 = new Televisor();
        t1.crearTelevisor();
        
        Lavadora l = new Lavadora();
        l.crearLavadora();
        Lavadora l1 = new Lavadora();
        l1.crearLavadora();
        
        electrodomesticos.add(t);
        electrodomesticos.add(t1);
        electrodomesticos.add(l);
        electrodomesticos.add(l1);
        
        for (Electrodomestico aux : electrodomesticos) {
            if(aux instanceof Televisor){
                System.out.println(((Televisor) aux).precio);
            }
            if (aux instanceof Lavadora) {
                System.out.println(((Lavadora) aux).precio);
            }
            sumar += aux.precio;
        }
        System.out.println("La suma es: " + sumar);
    }
    
}
