package com.mycompany.modeladoObjetosAnimales;

public class Ejecutar {

    public static void main(String[] args) {
        Aves ave = new Aves("Pepa");
        ave.caminar();
        ave.volar();
        System.out.println(ave.emitirSonido());


        Pez pez = new Pez("Nemo");
        pez.nada();
        System.out.println(pez.emitirSonido());

        AnimalTerrestre animalTerrestre = new AnimalTerrestre("Simba");
        animalTerrestre.caminar();
        System.out.println(animalTerrestre.emitirSonido());

    }
}
