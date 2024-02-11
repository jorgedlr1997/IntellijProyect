package com.mycompany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FizzBuzzTestArray {

    public String[] fizzBuzz() {
        String[] result = new String[100];
        for (int i = 0; i < 100; i++) {
            int num = i+1;
            if (num % 3 == 0 && num % 5 ==0){
                result[i]="fizzbuzz";
            }else if (num % 3 == 0){
                result[i]= "fizz";
            } else if (num % 5 ==0) {
                result[i]="buzz";
            } else{
                result[i] = String.valueOf(num);
            }
        }
        return result;
    }

    @Test
    void testFizzBuzzLength() {
        assertEquals(100, fizzBuzz().length);
        assertEquals("1", fizzBuzz()[0]);
        assertEquals("buzz", fizzBuzz()[99]);
    }

    @Test
    void testFizzMultiplesOf3() {
        assertEquals("fizz", fizzBuzz()[2]);
        assertNotEquals("fizz", fizzBuzz()[4]);
        assertEquals("fizz", fizzBuzz()[5]);
    }

    @Test
    void testBuzzMultiplesOf5(){
        assertEquals("buzz", fizzBuzz()[4]);
        assertNotEquals("buzz", fizzBuzz()[2]);
        assertEquals("buzz", fizzBuzz()[9]);
    }

    @Test
    void testBuzzFizzMultiplesOf3and5(){
        assertEquals("fizzbuzz", fizzBuzz()[14]);
        assertEquals("fizzbuzz", fizzBuzz()[29]);
    }

    @Test
    void testRestNumber(){
        assertEquals("2", fizzBuzz()[1]);
        assertEquals("19", fizzBuzz()[18]);
        assertEquals("98", fizzBuzz()[97]);
    }
}





