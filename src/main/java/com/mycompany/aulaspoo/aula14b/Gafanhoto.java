package com.mycompany.aulaspoo.aula14b;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssitido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    protected void ganharExp() {
        this.experiencia = this.getTotAssitido();
    }

    public void viuMaisUm(){
        this.setTotAssitido(this.getTotAssitido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssitido=" + totAssitido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
