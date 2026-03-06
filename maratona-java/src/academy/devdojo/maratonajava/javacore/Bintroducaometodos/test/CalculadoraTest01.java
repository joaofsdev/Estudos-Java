package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somarDoisNumeros(20, 2);
        calculadora.subtrairDoisNumeros(10, 3);
        calculadora.multiplicarDoisNumeros(10, 3);
        calculadora.dividirDoisNumeros(9, 3);
    }
}
