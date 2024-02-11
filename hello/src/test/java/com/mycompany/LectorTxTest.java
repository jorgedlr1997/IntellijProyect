package com.mycompany;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectorTxTest {

    Object[] procesarArchivo(String file) {

        int totalPalabras = 0;
        int totalCaracteres = 0;
        int palabraMayor = 0;
        String palabraMasLarga = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null){
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

    @Test
    void comprobarTotalPalabras() {
        Object[] result = procesarArchivo("src/test/java/resources/text.txt");
        assertEquals(8, result[2]);
    }

    @Test
    void comprobarPalabraMasLarga() {
        Object[] result = procesarArchivo("src/test/java/resources/text.txt");
        assertEquals("veintiseis", result[0]);
    }

    @Test
    void comprobarLaMedia() {
        Object[] result = procesarArchivo("src/test/java/resources/text.txt");
        assertEquals(4.625, result[1]);
    }

    @Test
    void comprobarTipoDeRetorno() {
        Object[] result = procesarArchivo("src/test/java/resources/text.txt");
        assertEquals(Object[].class, result.getClass());
    }
}

