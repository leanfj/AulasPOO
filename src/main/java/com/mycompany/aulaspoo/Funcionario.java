package com.mycompany.aulaspoo;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(
            String setor,
            boolean trabalhando,
            String nome,
            int idade,
            String sexo
    ) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    private String getSetor() {
        return setor;
    }

    private void setSetor(String setor) {
        this.setor = setor;
    }

    private boolean isTrabalhando() {
        return trabalhando;
    }

    private void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
    }
}
