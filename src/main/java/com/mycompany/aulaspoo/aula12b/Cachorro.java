package com.mycompany.aulaspoo.aula12b;

public class Cachorro extends Mamifero{
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}
