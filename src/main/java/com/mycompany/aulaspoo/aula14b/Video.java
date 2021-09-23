package com.mycompany.aulaspoo.aula14b;

public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;

        novaAvaliacao = (int) ((this.avaliacao + avaliacao) / this.getViews());

        this.avaliacao = novaAvaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!this.isReproduzindo()) {
            this.setReproduzindo(true);
            this.setViews(this.getViews() + 1);
            System.out.println("Video " + this.getTitulo() + " sendo reproduzido!");
        }
    }

    @Override
    public void pause() {
        if (!this.isReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("Video " + this.getTitulo() + " pausado");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
        System.out.println("Video " + this.getTitulo() + " tem " + this.getCurtidas());
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
