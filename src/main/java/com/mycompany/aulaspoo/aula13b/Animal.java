package com.mycompany.aulaspoo.aula13b;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public abstract void emitirSom();
}
