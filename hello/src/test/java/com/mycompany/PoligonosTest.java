package com.mycompany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoligonosTest {

    @Test
    void calculateAreaTriangulo(){
        CalcularAreaPoligono calcularAreaPoligono = new CalcularAreaPoligono();
        Triangulo triangulo = new Triangulo(3, 4);
        assertEquals(6.0, calcularAreaPoligono.calcularAreaClase(triangulo));
    }

    @Test
    void calculateAreaRenctangulo(){
        CalcularAreaPoligono calcularAreaPoligono = new CalcularAreaPoligono();
        Rectangulo rectangulo = new Rectangulo(3, 4);
        assertEquals(12.0, calcularAreaPoligono.calcularAreaClase(rectangulo));
    }

    @Test
    void calculateAreaCuadrado(){
        CalcularAreaPoligono calcularAreaPoligono = new CalcularAreaPoligono();
        Cuadrado cuadrado = new Cuadrado(3);
        assertEquals(9.0, calcularAreaPoligono.calcularAreaClase(cuadrado));
    }


}

class CalcularAreaPoligono{
    double calcularAreaClase(Poligono poligono){
        return poligono.calcularArea();
    }
}

abstract class Poligono{
    abstract double calcularArea();
}

class Triangulo extends Poligono{

    double altura;
    double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

class Rectangulo extends Poligono{

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base* altura;
    }
}

class Cuadrado extends Poligono{

    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}