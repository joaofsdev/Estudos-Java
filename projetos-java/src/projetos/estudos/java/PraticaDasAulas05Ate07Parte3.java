package projetos.estudos.java;

import java.util.Scanner;

public class PraticaDasAulas05Ate07Parte3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Sistema de Notas-----");

        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        double[] notas = new double[qtdAlunos];
        double soma = 0;
        double media;
        int alunosAcimaMedia = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        media = soma / qtdAlunos;

        for (int i = 0; i < qtdAlunos; i++) {
            if (notas[i] > media) {
                alunosAcimaMedia++;
            }
        }

        System.out.println("A media da turma foi: " + media);
        System.out.println("O total de alunos acima da media foi: " + alunosAcimaMedia);

        scanner.close();
    }
}
