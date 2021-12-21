
package TP_6;

public class UsoVehiculo {
    
    static Vehiculo[] moviles;
    
    public static void main(String[] args) {
        Vehiculo v1 = new Moto();
        Coche v2 = new Coche();
        
        System.out.println(acelerar(100, v1));
        System.out.println(v1.frenar(25));
        System.out.println(acelerar(130, v2));
        System.out.println(v1.frenar(25));
    }
    
    static void destruyeVehiculo(Vehiculo ve){
        System.out.println("Envio a desague " + ve.toString());
    }
    
    static String acelerar(int cantidad, Vehiculo ve){
        return ve.acelerar(cantidad);
    }
    
    public static void generar(){
        moviles = new Vehiculo[6];
        moviles[0] = new Moto();
        moviles[1] = new Coche();
        moviles[2] = new Moto();
        moviles[3] = new Moto();
        moviles[4] = new Coche();
        moviles[5] = new Moto();
        
        for (int i = 0; i < 10; i++) {
            avanza();
        }
    }
    
    public static void avanza(){
        System.out.println("Avanzado");
        for (int i = 0; i < 10; i++) {
            System.out.println(moviles[i].getClass());
        }
    }
    
}
