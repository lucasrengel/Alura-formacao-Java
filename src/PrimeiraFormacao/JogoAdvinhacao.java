package PrimeiraFormacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        int numero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo de adivinhacao!\nVoce tem 5 chances para acertar o numero secreto!");
        for(int i = 1; i <= 5; i++){
            System.out.println("Tentativa " + (i));
            System.out.print("Digite um numero: ");
            numero = leitor.nextInt();

            if(numero == numeroSecreto){
                System.out.println("\nParabens voce acertou o numero secreto!");
                break;
            } else if (numero < numeroSecreto) {
            System.out.println("O numero digitado esta menor que o numero secreto");
            } else {
            System.out.println("O numero digitado esta maior que o numero secreto");
            }
        }
        if(numero != numeroSecreto){
            System.out.println("\nVoce perdeu, tente novamente!\nO numero secreto era: " + numeroSecreto);
        }
    }
}
