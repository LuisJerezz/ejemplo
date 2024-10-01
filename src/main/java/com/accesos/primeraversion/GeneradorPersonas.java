package com.accesos.primeraversion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.accesos.primeraversion.Excepciones.DniException;
import com.accesos.primeraversion.modelo.Persona;
import com.accesos.primeraversion.modelo.Sexo;

/**
 * Clase general para cargar archivos de nombres y apellidos 
 * y generar aleatoriamente listas de personas.
 */
public class GeneradorPersonas {
    private List<String> listaNombresHombres;
    private List<String> listaNombresMujeres;
    private List<String> listaApellidos;
    private Sexo[] sexos;
    
    public GeneradorPersonas() {
        this.sexos = Sexo.values();
    }

    /**
     * Configuración inicial para indicar dónde están 
     * los archivos que contienen nombres y apellidos
     * Un nombre o un apellido por linea del fichero 
     * 
     * @param archivoNombreMujer El nombre del archivo con los nombres de mujer
     * @param archivoNombreHombre El nombre del archivo con los nombres de hombre
     * @param archivoApellidos El nombre del archivo con los apellidos
     */
    public void loadData(
        String archivoNombreMujer, String archivoNombreHombre, String archivoApellidos){
        
        try {
            this.listaApellidos = Files.readAllLines(Paths.get(archivoApellidos));
            this.listaNombresHombres = Files.readAllLines(Paths.get(archivoNombreHombre));
            this.listaNombresMujeres = Files.readAllLines(Paths.get(archivoNombreMujer));

        } catch (IOException e) {
            System.err.println("ERROR AL CARGAR LOS DATOS");
            System.err.println(e.getLocalizedMessage());
        }
    }


    /**
     * Devuelve un elemento aleatorio de la lista de 
     * String que es el que se le pasa como parámetro
     * 
     * @param lista Una lista de cadena de caracteres
     * @return un String
     */
    String getRandomString(List<String> lista){
        return lista.get(generateRandomNumber(lista.size()));
    }


    /**
     * Genera un número aleatorio entre el 0 y max-1
     * 
     * @param max número máximo (excluido)
     * @return un aleatorio 0..max-1
     */
    public static int generateRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    /**
     * Generador aleatorio que devuelve un sexo
     * 
     * @return sexo aleatorio
     */
    private Sexo getRandomSexo(){
        Sexo s = sexos[generateRandomNumber(sexos.length)];

        return s;
    }


    /**
         * El correo es:
         * primera letra del nombre
         * primer apellido sin espacios
         * segundo apellido sin espacios
         * todo en minúscula
         * quitamos acentos, letras ñ y letras c
         * @param p
         * @return 
         */
    String getEmail(Persona P){
        String email = "@educaand.es";

        return email;
    }


    public char calcularLetra(int dni) throws DniException{
        if(dni > 99999999 || dni < 10000000){
            throw new DniException("DNI fuera de rango");
        }
        String caracteres = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        int resto = dni%21;
        return caracteres.charAt(resto);
    }



    /**
     * Nos devuelve una persona generada aleatoriamente
     * 
     * @return un objeto tipo Persona
     */
    private Persona getRandomPersona(){
        Persona p = new Persona();
        Sexo[] sexos = Sexo.values(); 
        

        p.setSexo(getRandomSexo());

        switch (p.getSexo()) {
            case HOMBRE -> p.setNombre(getRandomString(listaNombresHombres));
            case MUJER -> p.setNombre(getRandomString(listaNombresMujeres));
            default -> p.setNombre(
                    generateRandomNumber(2)==0?
                    getRandomString(listaNombresHombres):
                    getRandomString(listaNombresMujeres));
    }
        p.setApellido(getRandomString(listaApellidos));

        return p;
    }

    public List<Persona> generaPersonas(int numero) throws Exception{
        List<Persona> lista = new ArrayList<>();
        if (this.listaApellidos==null || this.listaNombresHombres==null || this.listaNombresMujeres==null) {
            System.err.println("NO SE HAN PODIDO CARGAR LOS DATOS");
        }
        for (int i = 0; i < numero; i++) {
            lista.add(getRandomPersona());
        }
        
        return lista;
    }


    LocalDate generaFecha(){
        long starting_date = LocalDate.of(1920,1, 1).toEpochDay();
        long ending_date = LocalDate.now().toEpochDay();

        Random random = new Random();
        random.nextLong(ending_date - starting_date);
        LocalDate.parse(random);
        return null;
    }
}
