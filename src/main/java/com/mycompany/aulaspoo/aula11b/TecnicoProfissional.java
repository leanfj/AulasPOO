package com.mycompany.aulaspoo.aula11b;

public class TecnicoProfissional extends Aluno{
    private int registroProfissional;

    public TecnicoProfissional(String nome, int idade, String sexo, int matricula, String curso, int registroPRofissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroPRofissional;
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("Praticando ensino");
    }

    @Override
    public String toString() {
        return "TecnicoProfissional{" +
                "Nome='" + this.getNome() + '\'' +
                ", registroProfissional=" + registroProfissional +
                '}';
    }
}
