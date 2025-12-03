public class PraticaDasAulas01Ate05 {
    public static void main(String[] args) {

        // Operações matemáticas
        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);


        // Verificação de maioridade
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }


        // Comparação numérica
        int numero3 = 22;
        int numero4 = 21;

        if (numero3 > numero4) {
            System.out.println(numero3 + " é maior que " + numero4);
        } else if (numero3 < numero4) {
            System.out.println(numero3 + " é menor que " + numero4);
        } else {
            System.out.println("Os números são iguais");
        }


        // Classificação de nota
        double nota = 5.5;

        if (nota >= 7) {
            System.out.println("Aluno aprovado com nota = " + nota);
        } else if (nota < 5) {
            System.out.println("Aluno reprovado com nota = " + nota);
        } else {
            System.out.println("Aluno em recuperação com nota = " + nota);
        }


        // Par ou ímpar
        int numero5 = 19;

        if (numero5 % 2 == 0) {
            System.out.println("O número " + numero5 + " é par");
        } else {
            System.out.println("O número " + numero5 + " é ímpar");
        }


        // IMC
        double peso = 65.3;
        double altura = 1.81;
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

    }
}
