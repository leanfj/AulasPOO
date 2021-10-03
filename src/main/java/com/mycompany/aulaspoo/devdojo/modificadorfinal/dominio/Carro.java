package com.mycompany.aulaspoo.devdojo.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
