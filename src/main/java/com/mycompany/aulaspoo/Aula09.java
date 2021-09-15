package com.mycompany.aulaspoo;

public class Aula09 {

    public static void main(String[] args) {
        System.out.println("Aula 09");

        Pessoa novaPessoa = new Pessoa("Leandro", 35, "M");
        novaPessoa.detalhes();

        Aluno novoAluno = new Aluno(
                2222,
                "ADM",
                "Carlos",
                23,
                "M"
        );
        novoAluno.detalhes();
  

        Professor novoProfessor = new Professor(
                "Zoologia",
                4500.65f,
                "Paula Matos",
                45,
                "F"
        );

        novoProfessor.detalhes();

        Funcionario novoFuncionario = new Funcionario(
                "Cantina",
                true,
                "Maria",
                55,
                "F"
        );
        
        novoFuncionario.detalhes();

    }
}
