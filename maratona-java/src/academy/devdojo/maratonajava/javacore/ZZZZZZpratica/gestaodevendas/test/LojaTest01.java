package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodevendas.test;

import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.gestaodevendas.dominio.Produto;

import java.util.Scanner;

public class LojaTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.println("Digite o preco do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto(nomeProduto, preco);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto2 = scanner.nextLine();
        System.out.println("Digite o preco do produto: ");
        double preco2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o desconto do produto: ");
        double desconto2 = scanner.nextDouble();
        scanner.nextLine();

        Produto produto2 = new Produto(nomeProduto2, preco2, quantidade2, desconto2);

        produto.imprimeDados();
        System.out.println("");
        produto2.imprimeDados();

        System.out.println("Quantas unidades do produto 1, voce deseja? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        produto.realizarVenda(quantidade);
    }
}
