package com.mycompany.aulaspoo;

import java.util.Random;

public class Luta {

    //Atributos
    private Competidor desafiado;
    private Competidor desafiante;
    private int rounds;
    private boolean aprovada;
    private int vencedor;

    //Metodos Especiais
    private Competidor getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Competidor desafiado) {
        this.desafiado = desafiado;
    }

    private Competidor getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Competidor desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    private int getVencedor() {
        return vencedor;
    }

    private void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    //Metodos publicos
    public void marcarLuta(Competidor competidor1, Competidor competidor2) {
        if ((competidor1.getCategoria().equals(competidor2.getCategoria())) && (competidor1 != competidor2)) {
            this.setAprovada(true);
            this.setDesafiado(competidor1);
            this.setDesafiante(competidor2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();

            this.setVencedor(aleatorio.nextInt(3));

            switch (this.getVencedor()) {
                case 0:
                    System.out.println("---- EMPATE ----");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vencedor é " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("Vencedor é " + this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
        } else {
            System.out.println("A Luta não pode acontecer");
        }
    }

}
