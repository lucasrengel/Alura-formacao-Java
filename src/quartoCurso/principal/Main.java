package quartoCurso.principal;

import quartoCurso.calculos.CalculadoraDeTempo;
import quartoCurso.calculos.FiltroRecomendacao;
import quartoCurso.modelos.Episodio;
import quartoCurso.modelos.Filme;
import quartoCurso.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Carros", 2007);
        filme.setDuracaoEmMinutos(120);


//       filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(10);
        filme.avalia(9.5);
//       System.out.println("Total de avaliacoes: " + filme.getTotalDeAvaliacoes());
//       System.out.println(filme.pegaMedia());
//       System.out.println(filme.pegaMedia());

//       System.out.println("Media de avaliacoes do filme: " +filme.pegaMedia());

        Serie serie = new Serie("Carros atraves da estrada", 2022);
//      serie.exibeFichaTecnica();
        serie.setTemporadas(1);
        serie.setEpisodiosPorTemporada(6);
        serie.setMinutosPorEpisodio(10);
//      System.out.println("Duracao maratona Carros atraves da estrada:  " + serie.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Guardioes da galaxia 3", 2023);
        filme2.setDuracaoEmMinutos(164);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
//      System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
//      filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
//      filtro.filtra(episodio);

        Filme filme3 = new Filme("GranTurismo", 2023);
        filme3.avalia(10);
        filme3.setDuracaoEmMinutos(135);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme da lista: " + listaDeFilmes.get(1).getNome());
        System.out.println("Nome do terceiro filme da lista: " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes);
    }
}