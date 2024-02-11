package com.mycompany.modeladoObjetosAnimales;

public class AnimalTerrestre extends Animal implements AccionCaminar{
    public AnimalTerrestre(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        System.out.println(getNombre()+" camina tranquilo por la sabana");
    }

    @Override
    public String emitirSonido() {
        return "Grrrrrr Grrrrraaaa";
    }
}
