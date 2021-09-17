package com.mycompany.aulaspoo.aula11b;

public class Bolsista extends Aluno{
    private int bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa renovada");
    }

    @Override
    public void pagarMesalidade() {
        System.out.println("Pagando mensalidade do bolsista");
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "Nome='" + this.getNome() + '\'' +
                ", bolsa=" + bolsa +
                '}';
    }
}
