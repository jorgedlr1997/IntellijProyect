package com.mycompany.modeladoObjetosAnimales;

public class Pez extends Animal{
    public Pez(String nombre) {
        super(nombre);
    }

    public void nada(){
        System.out.println(getNombre()+" nada como un tiburón");
    }

    @Override
    public String emitirSonido() {
        return "Glu glu glu gluuuu";
    }
}
