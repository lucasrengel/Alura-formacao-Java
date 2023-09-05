package segundaFormacao;

import segundaFormacao.calculos.CalculadoraDeTempo;
import segundaFormacao.modelos.Filme;
import segundaFormacao.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Carros");
        filme.setAnoDeLancamento(2007);
        filme.setDuracaoEmMinutos(120);


        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(10);
        filme.avalia(9.5);
        System.out.println("Total de avaliacoes: " + filme.getTotalDeAvaliacoes());
        System.out.println(filme.pegaMedia());
        System.out.println(filme.pegaMedia());

        System.out.println("Media de avaliacoes do filme: " +filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Carros atraves da estrada");
        serie.setAnoDeLancamento(2022);
        serie.exibeFichaTecnica();
        serie.setTemporadas(1);
        serie.setEpisodiosPorTemporada(6);
        serie.setMinutosPorEpisodio(10);
        System.out.println("Duracao maratona Carros atraves da estrada:  " + serie.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Guardioes da galaxia 3");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(164);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}
