package primeiraFormacao;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        System.out.println("Avalie tres filmes");
        for(int i = 0; i < 3; i++){
            System.out.print("Digite sua avaliacao para o filme: ");
            nota = leitor.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("A media das avaliacoes eh: " + (mediaAvaliacao / 3));
    }
}
