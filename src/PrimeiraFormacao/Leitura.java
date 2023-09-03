package PrimeiraFormacao;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do filme");
        String filme = leitor.nextLine();
        System.out.println("Qual o ano de lancamento?");
        int anoDeLancamento = leitor.nextInt();
        System.out.println("De uma nota para o filme: " + filme);
        double avaliacao = leitor.nextDouble();

        System.out.println("Filme: " + filme + "\nAno de lancamento: " + anoDeLancamento + "\nNota do filme: " + avaliacao);

    }
}
