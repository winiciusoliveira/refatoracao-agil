package com.trabalho.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatoTest {

    @Test
    void voar() {
        Pato pato = new Pato();
        pato.setAsas(true);
        assertDoesNotThrow(pato::voar);
    }
}