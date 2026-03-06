package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // next - uma palavra --- nextLine - linha inteira
        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite seu idade abaixo");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
