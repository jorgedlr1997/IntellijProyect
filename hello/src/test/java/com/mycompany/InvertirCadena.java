package com.mycompany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertirCadena {

    public String invertirCadena(String cadena){

        StringBuilder st = new StringBuilder();

        int lenght =cadena.length();

        for (int i = lenght-1; i >=0  ; i--) {
            st.append(cadena.charAt(i));
        }
        return st.toString();
    }
    @Test
    void testReversoString(){
        assertEquals("odnum aloH", invertirCadena("Hola mundo"));
    }

    @Test
    void testEmptyString(){
        assertEquals("", invertirCadena(""));
    }

    @Test
    void testSingleCharacterString(){
        assertEquals("a", invertirCadena("a"));
    }

    @Test
    void testReverseString(){
        assertEquals("Hola mundo", invertirCadena("odnum aloH"));
    }
}
