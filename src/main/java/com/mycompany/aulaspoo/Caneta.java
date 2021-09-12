package com.mycompany.aulaspoo;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //Metodo construtor
    public Caneta(String modelo, String cor, float ponta) {
        this.tampar();
        this.setModel(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModel(String m) {
        this.modelo = m;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
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
