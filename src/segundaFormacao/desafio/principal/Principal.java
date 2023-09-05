package segundaFormacao.desafio.principal;

import segundaFormacao.desafio.modelos.MinhasPreferidas;
import segundaFormacao.desafio.modelos.Musica;
import segundaFormacao.desafio.modelos.Podcast;

public class Principal{
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("'La vida es una'");
        minhaMusica.setArtista("Karol G");

        for(int i = 0; i <= 100; i++){
            minhaMusica.reproduz();
        }

        for(int i = 0; i <= 87; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("'BolhaDev'");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 50; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 26; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
