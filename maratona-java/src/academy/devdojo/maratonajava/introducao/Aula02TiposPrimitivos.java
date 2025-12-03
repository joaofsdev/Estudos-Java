package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos: int, double, float, char, byte, short, long, boolean - Sempre com letra minuscula
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0; // Utilizado para numeros decimais
        float salarioFloat = 2500.0F; // Utilizado para numeros decimais, mas precisa utilizar F no final
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true; // Verdadeiro ou Falso
        char caractere = 65; // Guarda um caractere e utiliza Tabela ASCII
        char caractereUniCode = '\u0041'; // Guarda um caractere e utiliza Unicode

        String nome = "Joao"; // Classe String - Absorve Texto
        var nome2 = "Silva";
        // Casting
        int numero = (int) 10000000000000000L; // Forca entrada de valor e corta bytes para caber na memoria

        System.out.println("A idade e " + idade);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(caractereUniCode);
        System.out.println(numero);
        System.out.println("Oi meu nome e " + nome);
        System.out.println("Oi meu nome e " + nome2);
    }
}