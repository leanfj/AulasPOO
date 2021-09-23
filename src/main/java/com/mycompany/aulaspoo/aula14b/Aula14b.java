package com.mycompany.aulaspoo.aula14b;

public class Aula14b {
    public static void main(String[] args) {
        System.out.println("Aula 14 B");

        Video v1 = new Video("Aula de POO");
        Gafanhoto g1 = new Gafanhoto("Leandro", 35, "M", "leanfj" );

        System.out.println(g1.toString());

        System.out.println(v1.toString());

        Visualizacao vis1 = new Visualizacao(g1, v1);

        vis1.avaliar(83.0f);
        vis1.getFilme().like();

        System.out.println(vis1.toString());

    }
}
