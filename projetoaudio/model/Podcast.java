package com.rudy.projetoaudio.model;

public class Podcast extends Audio {

    protected String host;
    protected String descricao;
    protected String apresentador;


    @Override
    public void curtir() {
        super.curtir();
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
    } else {
        return 8;
       }

    }
}

