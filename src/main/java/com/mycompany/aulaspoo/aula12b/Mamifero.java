package com.mycompany.aulaspoo.aula12b;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", corPelo='" + corPelo + '\'' +
                '}';
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
