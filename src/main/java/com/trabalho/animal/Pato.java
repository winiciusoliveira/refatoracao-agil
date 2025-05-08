package com.trabalho.animal;

public class Pato extends Ave {
    @Override
    public void nadar() {
        System.out.println("Pato está nadando!");
    }

    @Override
    public void andar() {
        System.out.println(this.nome + " Anda um pé de cada vez");
    }

    public void voar() {
        if (this.asas) {
            System.out.println("Pato pode voar");
        } else {
            System.out.println("Pato não pode voar");
        }
    }
}
