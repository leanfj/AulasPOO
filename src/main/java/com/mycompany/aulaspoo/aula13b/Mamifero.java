package com.mycompany.aulaspoo.aula13b;

public class Mamifero extends Animal{
    protected String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
