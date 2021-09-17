package com.mycompany.aulaspoo.aula12b;

public class Trataruga extends Reptil{
    public Trataruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Andando beeeem devagar");
    }

}
