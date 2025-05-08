package com.trabalho;


import com.trabalho.animal.Pato;
import com.trabalho.animal.Pinguim;

public class Main {
    public static void main(String[] args) throws Exception {
        Pinguim pinguim = new Pinguim();
        pinguim.setNome("Pinguim");
        pinguim.bicar(); // SAÍDA: Um Pinguim pode bicar
        pinguim.andar(); // SAIDA: Um Pinguim pode andar
        pinguim.nadar(); // SAIDA: Um Pinguim pode nadar

        System.out.println("===============");

        Pato pato = new Pato();
        pato.setNome("Pato");
        pato.andar(); // SAIDA: Um Pato pode andar
        pato.nadar(); // SAIDA: Um Pato pode nadar
        pato.bicar(); // SAIDA: Um Pato pode bicar
    }
}