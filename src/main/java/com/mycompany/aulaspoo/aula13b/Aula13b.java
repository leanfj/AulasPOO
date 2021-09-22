package com.mycompany.aulaspoo.aula13b;

public class Aula13b {
    public static void main(String[] args) {
        System.out.println("Aula 13 B");

        //Animal a1 = new Animal();

        Mamifero m1 = new Mamifero(4.5f, 4, 4, "Preto");
        m1.emitirSom();

        Lobo l1 = new Lobo(10f, 8, 4, "Cinza");
        l1.emitirSom();

        Cachorro c1 = new Cachorro(5.6f, 5, 4, "Caramelo");
        c1.emitirSom();

        c1.reagir("Cheguei");
        c1.reagir("Vai apanhar");

        c1.reagir(11, 45);
        c1.reagir(19, 00);

        c1.reagir(true);
        c1.reagir(false);

        c1.reagir(2, 12.5f);
        c1.reagir(17, 4.5f);
    }
}
