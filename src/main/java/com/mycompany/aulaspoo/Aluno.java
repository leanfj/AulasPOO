package com.mycompany.aulaspoo;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(
            int matricula,
            String curso,
            String nome,
            int idade,
            String sexo
    ) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula() {
        System.out.println("Matrícula sendo cancelada");
    }

}
