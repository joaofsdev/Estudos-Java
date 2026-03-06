package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void subtrairDoisNumeros(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public void multiplicarDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double dividirDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public void alterarDoisNumeros(int n1, int n2) {
        n1 = 99;
        n2 = 33;

        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("n1: " + n1 + " n2: " + n2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }

        System.out.println("Soma: " + soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }

        System.out.println("Soma: " + soma);
    }
}
