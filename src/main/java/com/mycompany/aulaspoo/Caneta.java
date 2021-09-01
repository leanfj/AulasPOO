/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aulaspoo;

/**
 *
 * @author Locatech
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        
        if(this.tampada) {
            System.out.println("Esta caneta está tampada!");
        } else {
            System.out.println("Esta caneta está destampada");
        }
        
    }
    
    void rabiscar() {
        
        if (!this.tampada) {
            System.out.println("Estou rabiscando");
        } else {
            System.out.println("Erro! Não posso rabiscar!");
        }
                
        
    }
    
    void tampar() {
        this.tampada = true;
        
    }
    
    void destampar() {
        this.tampada = false;
    }
}
