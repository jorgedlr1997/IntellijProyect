package com.mycompany;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {

    public static Object[] procesarArchivo() {
String file="src/test/java/resources/text.txt";
        int totalPalabras = 0;
        int totalCaracteres = 0;
        int palabraMayor = 0;
        String palabraMasLarga = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while ((line != null)) {
                String[] palabras = line.split("\\s+|\\p{Punct}+");

                for (String palabra : palabras) {
                    totalPalabras++;
                    totalCaracteres += palabra.length();
                    if (palabra.length() > palabraMayor) {
                        palabraMasLarga = palabra;
                        palabraMayor = palabra.length();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double mediaDeTamPalabras = totalPalabras > 0 ? (double) totalCaracteres / totalPalabras : 0.0;
        return new Object[]{palabraMasLarga, mediaDeTamPalabras, totalPalabras};
    }

    public static void main( String[] args ) {

    String pal = "Hola mundo";

        System.out.println(procesarArchivo());


    }
}
