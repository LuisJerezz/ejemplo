package com.accesos.primeraversion;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Personas gp = new Personas();
        gp.loadData(
            "datos\\nombres-mujer.txt",
            "datos\\nombres-hombre.txt",
            "datos\\apellidos.txt");
        
        try {
            gp.generaPersonas(100);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
