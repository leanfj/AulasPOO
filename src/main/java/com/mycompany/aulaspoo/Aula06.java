package com.mycompany.aulaspoo;

public class Aula06 {
    public static void main (String[] args) {
        ControleRemoto controleNovo = new ControleRemoto();
        
        controleNovo.ligar();
        controleNovo.play();

        controleNovo.abrirMenu();
        
        controleNovo.maisVolume();
        controleNovo.maisVolume();
        controleNovo.maisVolume();

        controleNovo.menosVolume();
        controleNovo.menosVolume();
        controleNovo.menosVolume();
        controleNovo.menosVolume();
        controleNovo.menosVolume();

        
        controleNovo.ligarMudo();
        controleNovo.desligar();
        controleNovo.abrirMenu();



    }
}
