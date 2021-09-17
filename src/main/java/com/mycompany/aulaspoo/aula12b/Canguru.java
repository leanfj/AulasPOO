package com.mycompany.aulaspoo.aula12b;

public class Canguru extends Mamifero{

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa(){
        System.out.println("usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
