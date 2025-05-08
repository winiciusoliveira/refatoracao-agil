package com.trabalho.animal;

// CLASSE ABSTRATA (CLASSE PAI) PARA LIDAR COM POLIMORFISMO
public abstract class Ave {

    /* Caracteristicas (Atributos) da Ave */
    protected String nome;
    protected Boolean asas = true;
    protected Boolean bico = true;
    protected Boolean penas = true;

    // Metodo para bicar
    public void bicar() throws Exception {
        if (bico) {
            System.out.println(nome + " Pode bicar");
        } else {
            System.out.println(nome + " Não pode bicar");
        }
    }

    public abstract void andar();

    // Metodo para aplicar polimorfismo
    public abstract void nadar();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBico(Boolean bico) {
        this.bico = bico;
    }

    public void setAsas(Boolean asas) {
        this.asas = asas;
    }

    public void setPenas(Boolean penas) {
        this.penas = penas;
    }
}
