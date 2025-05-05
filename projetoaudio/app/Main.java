package com.rudy.projetoaudio.app;
import com.rudy.projetoaudio.model.MinhasPreferidas;
import com.rudy.projetoaudio.model.Musica;
import com.rudy.projetoaudio.model.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Foverer");
        musica.setCantor("Kiss");

        for (int i = 0; i < 200; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 100; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 40; i++) {
            podcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);

        }
}
