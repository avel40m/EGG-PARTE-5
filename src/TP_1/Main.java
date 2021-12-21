
package TP_1;


public class Main {


    public static void main(String[] args) {
        Animal perro = new Perro("Chiquito", "Carne", 3, "Cocker");
        perro.Alimentarse();
        
        Animal perro1 = new Perro("China", "Verdura",5, "Boxer");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Garfield", "Peces", 2, "Siamess");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 7, "Fino");
        caballo.Alimentarse();
    }
    
}
