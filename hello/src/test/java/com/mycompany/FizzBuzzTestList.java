package com.mycompany;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTestList {

    public List<String> fizzBuzz(){

        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int num = i +1;

            if (num % 3 == 0 && num % 5 == 0) {
                lista.add(("fizzbuzz"));
            }else if (num % 3 ==0) {
                lista.add("fizz");
            } else if (num % 5 == 0) {
                lista.add("buzz");
            } else{
                lista.add(String.valueOf(num));
            }
        }
        return lista;
    }

    @Test
    void testListLenght(){
        assertEquals(100, fizzBuzz().size());
        assertEquals("1", fizzBuzz().get(0));
        assertEquals("100", fizzBuzz().get(99));
    }

    @Test
    void testMultiplesOf3(){
        assertEquals("fizz", fizzBuzz().get(2));
        assertEquals("fizz", fizzBuzz().get(5));
    }

    @Test
    void testMultiplesOf5(){
        assertEquals("buzz", fizzBuzz().get(4));
        assertEquals("buzz", fizzBuzz().get(9));
    }

    @Test
    void testMultiplesOf3And5(){
        assertEquals("fizzbuzz", fizzBuzz().get(14));
        assertEquals("fizzbuzz", fizzBuzz().get(29));
        assertEquals("fizzbuzz", fizzBuzz().get(44));
    }

    @Test
    void testNumbersRest(){
        assertEquals("98", fizzBuzz().get(97));
        assertEquals("23", fizzBuzz().get(22));
    }

}
