package com.trabalho.animal;

// APLICANDO POLIMORFISMO (CLASSE FILHA)
public class Pinguim extends Ave {
    @Override
    public void andar() {
        System.out.println(this.nome + " Anda com os dois pès juntos");
    }

    @Override
    public void nadar() {
        System.out.println("Pinguim está nadando!");
    }
}
