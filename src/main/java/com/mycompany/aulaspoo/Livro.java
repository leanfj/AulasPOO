package com.mycompany.aulaspoo;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual = 0;
        this.aberto = false;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotalPaginas() {
        return totalPaginas;
    }

    private void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totalPaginas=" + totalPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + '}';
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotalPaginas() && !this.isAberto()) {
            System.out.println("Numero de paginas não permitido!");
        } else {
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPagina() {
        if (!this.isAberto() || (this.getPagAtual() + 1 > this.getTotalPaginas())) {
            System.out.println("Impossivel avançar");
        } else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPagina() {
        if (!this.isAberto() || (this.getPagAtual() == 0)) {
            System.out.println("Impossível retroceder");
        } else {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
