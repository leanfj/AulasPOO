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
public class Aula5 {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Leandro");
        pessoa1.abrirConta("CP");
        pessoa1.depositar(200);
        pessoa1.sacar(50);
        pessoa1.statusConta();
        

    }
}
