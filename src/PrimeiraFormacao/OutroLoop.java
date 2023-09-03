package PrimeiraFormacao;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1){
            System.out.print("Avalie o filme: ");
            nota = leitor.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media das avaliacoes: " + (mediaAvaliacao / 3));
    }
}
