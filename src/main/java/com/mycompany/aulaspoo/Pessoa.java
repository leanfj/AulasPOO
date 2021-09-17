package com.mycompany.aulaspoo;

public class Pessoa {
    //Attributes
    private String nome;
    private int idade;
    private String sexo;

    //Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.idade = idade;
        this.sexo = sexo;
    }

    //Metodos acessores e modificadores
    public String getNome() {
        return nome;     
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodos
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    public void detalhes() {
        System.out.println("Pessoa nome=" + nome + ", idade=" + idade + ", sexo=" + sexo);
    }
    
    
}
