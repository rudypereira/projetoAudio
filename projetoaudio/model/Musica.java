package com.rudy.projetoaudio.model;

public class Musica extends Audio {

    protected String album;
    protected String artista;
    protected String genero;
    protected String cantor;


    @Override
    public void curtir() {
        super.curtir();

    }

    @Override
    public void reproduzir() {
        super.reproduzir();
    }


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalDeReproducao() > 100) {
            return 10;
        } else {
            return 7;
        }
    }
}

