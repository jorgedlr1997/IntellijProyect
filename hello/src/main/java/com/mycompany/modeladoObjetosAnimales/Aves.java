package com.mycompany.modeladoObjetosAnimales;

public class Aves extends Animal implements AccionCaminar{

    public Aves(String nombre) {
        super(nombre);
    }

    public void volar(){
        System.out.println("Volando voy");
    }

    @Override
    public void caminar() {
        System.out.println(getNombre()+" camina como un ave");
    }

    @Override
    public String emitirSonido() {
        return "Quu quiri quiiiiiiiii!!!!";
    }
}
