package terceiroCurso.desafio;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite do seu cartao: ");
        double limite = scanner.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.print("Digite a descricao da compra: ");
            String descricao = scanner.next();

            System.out.print("Digite o valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 pra continuar");
                sair = scanner.nextInt();
            }else{
                System.out.println("saldo insuficiente!");
                sair = 1;
            }
        }

        System.out.println("******************");
        System.out.println("COMPRAS REALIZADAS\n");
        Collections.sort(cartao.getCompras());
        for(Compra compras: cartao.getCompras()){
            System.out.println(compras.getDescricao() + " - " + compras.getValor());
        }
        System.out.println("\n******************");
        System.out.println("\nSaldo do cartao: " + cartao.getSaldo());
    }
}
