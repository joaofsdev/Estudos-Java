package projetos.estudos.java;

import java.util.Scanner;

public class PraticaDasAulas05Ate07Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Par ou Impar------");
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);

    }
}
