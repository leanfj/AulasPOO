package com.mycompany.aulaspoo;

public class Aula07 {

    public static void main(String[] args) {
        Competidor lutadores[] = new Competidor[6];
        lutadores[0] = new Competidor("PrettyBoy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Competidor("Putscript", "Brasil", 29, 1.68f, 57.9f, 14, 2, 3);
        lutadores[2] = new Competidor("Snapshadow", "EUA", 35, 1.65f, 70.9f, 12, 2, 1);
        lutadores[3] = new Competidor("Dead Code", "Austrália", 28, 1.70f, 60.9f, 13, 0, 2);
        lutadores[4] = new Competidor("UFOCobol", "Brasil", 37, 1.70f, 119.9f, 5, 4, 3);
        lutadores[5] = new Competidor("Nerdaart", "EUA", 30, 1.81f, 105.9f, 12, 2, 4);

        for (int i = 0; i < lutadores.length; i++) {
            lutadores[i].status();
            System.out.println("");
        }

        for (int i = 0; i < 10; i++) {
            Luta UEC01 = new Luta(); 
            UEC01.marcarLuta(lutadores[0], lutadores[2]);
            UEC01.lutar();

        }

        for (int i = 0; i < lutadores.length; i++) {
            lutadores[i].status();
            System.out.println("");
        }

    }
}
