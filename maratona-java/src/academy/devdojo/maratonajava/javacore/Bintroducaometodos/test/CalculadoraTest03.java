package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int n1 = 1;
        int n2 = 2;

        calculadora.alterarDoisNumeros(n1, n2);

        System.out.println("\nFora do alterarDoisNumeros");
        System.out.println(n1);
        System.out.println(n2);
    }
}
