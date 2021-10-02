package com.mycompany.aulaspoo.devdojo.introducaoclasses.test;

import com.mycompany.aulaspoo.devdojo.introducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Paula Matos";
        professor.idade = 40;
        professor.sexo = 'F';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
