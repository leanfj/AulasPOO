package com.mycompany.aulaspoo.devdojo.modificadorfinal.teste;

import com.mycompany.aulaspoo.devdojo.modificadorfinal.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Uno");

        System.out.println(carro);
        System.out.println(Carro.VELOCIDADE_LIMITE);
//        System.out.println(carro.VELOCIDADE_LIMITE);
    }
}
