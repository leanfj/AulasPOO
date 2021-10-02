package com.mycompany.aulaspoo.devdojo.introducaoclasses.test;

import com.mycompany.aulaspoo.devdojo.introducaoclasses.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.idade = 35;
        p1.nome = "Leandro";
        p1.sexo = 'M';

        System.out.println(p1);
        System.out.println(p1.idade);
        System.out.println(p1.nome);
        System.out.println(p1.sexo);
    }
}
