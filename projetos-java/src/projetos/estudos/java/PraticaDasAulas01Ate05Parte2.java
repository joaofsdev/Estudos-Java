package projetos.estudos.java;

import java.util.Scanner;

public class PraticaDasAulas01Ate05Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sistema de Voto
        System.out.println("------Sistema de Voto------");
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto opcional");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto opcional");
        }

        // Sistema de Desconto
        System.out.println("------Sistema de Desconto------");
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        double precoProduto = 95.5;
        double desconto;
        double conta = 0;

        if (idade >= 60) {
            desconto = precoProduto * 0.2;
            conta = precoProduto - desconto;
            System.out.println("Seu desconto foi de R$" + desconto + ", valor do produto R$" + conta);
        } else if (idade < 18) {
            desconto = precoProduto * 0.1;
            conta = precoProduto - desconto;
            System.out.println("Seu desconto foi de R$" + desconto + ", valor do produto R$" + conta);
        } else {
            System.out.println("Voce nao tem desconto, valor do produto R$" + precoProduto);
        }
    }
}

