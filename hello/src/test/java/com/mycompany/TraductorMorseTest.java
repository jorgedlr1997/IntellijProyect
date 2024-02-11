package com.mycompany;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraductorMorseTest {

    String devolverEnMorse(String cadena){

        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");

        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");

        StringBuilder result = new StringBuilder();

        for(char c : cadena.toUpperCase().toCharArray()){
            result.append(morseMap.getOrDefault(c, ""));

            if (c == ' ') {
                result.append("  ");
            }else{
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    @Test
    void comprobandoMorseUnaLetraMayus(){
        assertEquals(".-", devolverEnMorse("A"));
    }

    @Test
    void comprobandoMorseUnaLetraMinus(){
        assertEquals(".-", devolverEnMorse("a"));
    }

    @Test
    void comprobandoPalabraHolaMayus(){
        assertEquals("....---.-...-", devolverEnMorse("HOLA"));
    }

    @Test
    void comprobandoPalabraHolaMinus(){
        assertEquals("....---.-...-", devolverEnMorse("hola"));
    }

    @Test
    void comprobandoFrase(){
        assertEquals(".... --- .-.. .-   -- ..- -. -.. ---", devolverEnMorse("hola mundo"));
    }

    @Test
    void comprobandoEspacios(){
        assertEquals(".-   -...", devolverEnMorse("A B"));
    }

    @Test
    void comprobandoNumeros(){
        assertEquals("---.. ----. .----", devolverEnMorse("891"));
    }

    @Test
    void comprobandoNumerosLetras(){
        assertEquals("---.. ----. .----   .- -... -.-.", devolverEnMorse("891 ABC"));
    }
}
