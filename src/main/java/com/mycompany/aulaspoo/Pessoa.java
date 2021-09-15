
package com.mycompany.aulaspoo;


public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Metodos acessores e modificadores
    public String getNome() {    
        return nome;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodos
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }
}
