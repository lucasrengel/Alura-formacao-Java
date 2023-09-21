package quartoCurso.principal;


import quartoCurso.modelos.Filme;
import quartoCurso.modelos.Serie;
import quartoCurso.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComListas {
    public static void main(String[] args) {
        Filme carros = new Filme("Carros", 2007);
        carros.avalia(10);
        Filme newcarros = new Filme("Carros 4", 2024);
        newcarros.avalia(8);
        Filme gdg = new Filme("Guardioes da galaxia 3", 2023);
        gdg.avalia(9);
        Filme granTurismo = new Filme("GranTurismo", 2023);
        granTurismo.avalia(8);
        Serie atravesDaEstrada = new Serie("Carros atraves da estrada", 2022);


        List<Titulo> lista = new ArrayList<>();
        lista.add(carros);
        lista.add(gdg);
        lista.add(granTurismo);
        lista.add(atravesDaEstrada);
        lista.add(newcarros);

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
        System.out.println(buscaArtista);
        System.out.println("");

        System.out.println("Lista de atores ordenada");
        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);

        System.out.println("\nLista de filmes ordenada");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("\nLista de filmes ordenada por data de lancamento");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}