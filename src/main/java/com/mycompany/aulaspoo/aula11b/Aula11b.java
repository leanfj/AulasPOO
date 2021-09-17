package com.mycompany.aulaspoo.aula11b;

public class Aula11b {
    public static void main (String[] args) {
        System.out.println("Aula 11 B");

        Visitante v1 = new Visitante("Leandro", 35, "M");

        System.out.println(v1.toString());

        Aluno a1 = new Aluno("Paulo", 40, "M", 1111, "ADS");

        System.out.println(a1.toString());
        a1.pagarMesalidade();

        Bolsista b1 = new Bolsista("Ana", 20, "F", 2222,"Farmácia", 50);

        System.out.println(b1.toString());
        b1.pagarMesalidade();

        Professor pr1 = new Professor("Mario", 50, "M", "Segurança da informação", 5550.45f );

        pr1.receberAumento(1000f);
        System.out.println(pr1.toString());

        TecnicoProfissional t1 = new TecnicoProfissional("João", 34, "M", 3333, "Informatica", 1234);

        System.out.println(t1.toString());
    }
}
