package com.rudy.projetoaudio.model;

public class Audio {

    // Atributos

    protected String titulo;
    protected double duracao;
    protected int totalDeReproducao;
    protected int totalCurtidas;
    protected int classificacao;

    // Metodos

    public void curtir() {
        totalCurtidas++;
    }

    public void reproduzir() {
        totalDeReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
       this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }
}
