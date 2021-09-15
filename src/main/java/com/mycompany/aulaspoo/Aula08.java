package com.mycompany.aulaspoo;

public class Aula08 {
    public static void main(String[] args) {
        System.out.println("Aula 08");
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[2];
        
        pessoas[0] = new Pessoa("Leandro", 35, "M");
        pessoas[1] = new Pessoa("Dayana", 33, "F");
        
        livros[0] = new Livro("Aprender JAVA", "Paulo José", 390, pessoas[0]);
        livros[1] = new Livro("Aprender POO com JAVA", "Maria Santana", 690, pessoas[1]);
        livros[0].abrir();
        livros[0].avancarPagina();
        livros[0].fechar();
        livros[0].voltarPagina();

        System.out.println(livros[0].detalhes());
        System.out.println(livros[1].detalhes());
        
        
    }
}
