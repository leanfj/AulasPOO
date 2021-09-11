package com.mycompany.aulaspoo;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);

        if (this.tampada) {
            System.out.println("Esta caneta está tampada!");
        } else {
            System.out.println("Esta caneta está destampada");
        }

    }

    public void rabiscar() {

        if (!this.tampada) {
            System.out.println("Estou rabiscando");
        } else {
            System.out.println("Erro! Não posso rabiscar!");
        }

    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;
    }
}
