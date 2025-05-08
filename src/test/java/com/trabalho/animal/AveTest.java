package com.trabalho.animal;

import static org.junit.jupiter.api.Assertions.*;

class AveTest {

    @org.junit.jupiter.api.Test
    void bicar() {
        Pinguim pinguim = new Pinguim();
        pinguim.setBico(false);
        assertDoesNotThrow(pinguim::bicar);
    }

    @org.junit.jupiter.api.Test
    void andar() {
    }

    @org.junit.jupiter.api.Test
    void nadar() {
    }
}