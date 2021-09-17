package com.mycompany.aulaspoo.aula12b;

public class Aula12b {
    public static void main (String[] args) {
        System.out.println("Aula 12 b");

        /*Animal a1 = new Animal();*/

        Mamifero m1 = new Mamifero(10, 4, 4, "Preto");

        System.out.println(m1.toString());
        m1.locomover();
        m1.emitirSom();

        Cachorro c1 = new Cachorro(5, 4, 4, "Cinza");
        c1.emitirSom();
        System.out.println(c1.toString());

        Canguru cang1 = new Canguru(30, 10, 4, "Marrom");

        System.out.println(cang1.toString());
        cang1.locomover();
    }
}
