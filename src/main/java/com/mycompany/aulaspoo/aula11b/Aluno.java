package com.mycompany.aulaspoo.aula11b;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
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

    public void pagarMesalidade() {
        System.out.println("Pagando mensalidade do aluno");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + this.getNome() + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
