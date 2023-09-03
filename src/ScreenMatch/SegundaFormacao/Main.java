package ScreenMatch.SegundaFormacao;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Carros";
        filme.anoDeLancamento = 2007;
        filme.duracaoEmMinutos = 120;

        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(10);
        filme.avalia(9.5);
        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.pegaMedia());

        System.out.println("Media de avaliacoes do filme: " +filme.pegaMedia());
    }
}
