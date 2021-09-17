package com.mycompany.aulaspoo.aula11b;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(float valor) {
        this.setSalario(this.getSalario() + valor);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Nome='" + this.getNome() + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
