package com.mycompany.aulaspoo.devdojo.introducaoclasses.test;

import com.mycompany.aulaspoo.devdojo.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Uno";
        carro.fabricante = "fiat";
        carro.ano = 2005;

        Carro outroCarro = new Carro();

        outroCarro.modelo = "Gol";
        outroCarro.fabricante = "Wolkswagen";
        outroCarro.ano = 2021;

        carro = outroCarro; //Atribuindo referencia

        System.out.println(carro.modelo);
        System.out.println(carro.fabricante);
        System.out.println(carro.ano);

        System.out.println("---------------------------");

        System.out.println(outroCarro.modelo);
        System.out.println(outroCarro.fabricante);
        System.out.println(outroCarro.ano);
    }
}
