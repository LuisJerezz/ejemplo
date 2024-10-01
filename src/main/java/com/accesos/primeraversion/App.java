package com.accesos.primeraversion;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        GeneradorPersonas gp = new GeneradorPersonas();
        gp.loadData(
            "datos\\nombres-mujer.txt",
            "datos\\nombres-hombre.txt",
            "datos\\apellidos.txt");
        
        try {
            System.out.println(gp.generaPersonas(10).toString());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
