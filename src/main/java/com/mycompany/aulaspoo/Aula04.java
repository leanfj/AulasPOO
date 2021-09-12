
package com.mycompany.aulaspoo;

public class Aula04 {
    public static void main (String[] args) {
        Caneta c1 = new Caneta("Bic Cristal", "Vermelho", 0.7f);
        
        //c1.setModel("Bic Cristal");
  
        //c1.setPonta(0.5f);
        
        c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        
        CanetaNova c2 = new CanetaNova("Sharp", "Verde", 1.1f);
        c2.status();
    }
}
