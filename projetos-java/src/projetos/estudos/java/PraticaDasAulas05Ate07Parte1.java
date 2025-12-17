package projetos.estudos.java;

import java.util.Scanner;

public class PraticaDasAulas05Ate07Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Sistema de Calculo------");
        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite a operacao: + - * ou /");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Nao e possivel dividir por zero!");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Digite uma operacao valida!");
        }

        scanner.close();

    }
}
