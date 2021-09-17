package com.mycompany.aulaspoo.aula12b;

public class Peixe extends Animal{

    private String corEscamas;

    public Peixe(float peso, int idade, int membros, String corEscamas) {
        super(peso, idade, membros);
        this.corEscamas = corEscamas;
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }
}
