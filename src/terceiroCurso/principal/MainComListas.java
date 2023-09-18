package terceiroCurso.principal;

import terceiroCurso.modelos.Filme;
import terceiroCurso.modelos.Serie;
import terceiroCurso.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainComListas {
    public static void main(String[] args) {
        Filme carros = new Filme("Carros", 2007);
        carros.avalia(10);
        Filme gdg = new Filme("Guardioes da galaxia 3", 2023);
        gdg.avalia(9);
        Filme granTurismo = new Filme("GranTurismo", 2023);
        granTurismo.avalia(8);
        Serie atravesDaEstrada = new Serie("Carros atraves da estrada", 2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(carros);
        lista.add(gdg);
        lista.add(granTurismo);
        lista.add(atravesDaEstrada);

        for (Titulo item: lista){
            System.out.println(item);
            if(item instanceof Filme filme){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Ryan Gosgling");
        buscaArtista.add("Robert Downey Junior");
        buscaArtista.add("Erza Miller");
        System.out.println("\n\n");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
    }
}