package primeiroCurso;

import java.util.Scanner;

public class Desafio {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = "Lucas Rengel";
        String tipoConta = "Corrente";
        double saldo = 2000;
        double valorDigitado = 0;
        int op = 0;

        System.out.println("============================================");
        System.out.println("Dados inicias do cliente:\n\nNome: " + nome + "\nTipo de conta: " + tipoConta + "\nSaldo inicial: R$ " + saldo);
        System.out.println("============================================");

        while(op != 4){
            exibirMenu();
            op = leitor.nextInt();
            if(op == 1){
                exibirSaldo(saldo);
            }
            if(op == 2){
                saldo = receberValor(saldo, valorDigitado);
            }
            if(op == 3){
                saldo = transferirValor(saldo, valorDigitado);
            }
            if(op == 4){
                System.out.println("Saindo do app, tchauu!");
                break;
            }
            if(op < 1 || op > 4){
                System.out.println("Opcao invalida, tente novamente!");
            }
        }
    }

    public static void exibirMenu(){
        System.out.println("\nOperacoes\n");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.print("Digite uma opcao: ");
    }

    public static void exibirSaldo(double saldo){
        System.out.print("\nSaldo atual: R$" + saldo);
    }

    public static double receberValor(double saldo, double valorDigitado){
        System.out.print("\nDigite o valor a receber: ");
        valorDigitado = leitor.nextDouble();
        saldo += valorDigitado;
        System.out.println("\nSaldo atualizado: R$" + saldo);
        return saldo;
    }

    public static double transferirValor(double saldo, double valorDigitado){
        System.out.print("\nDigite o valor a transferir: ");
        valorDigitado = leitor.nextDouble();
        if(valorDigitado > saldo){
            System.out.println("Valor inserido maior que saldo!, tente novamente");

        } else {
            saldo -= valorDigitado;
            System.out.println("\nSaldo atualizado: R$" + saldo);
        }
        return saldo;
    }
}
