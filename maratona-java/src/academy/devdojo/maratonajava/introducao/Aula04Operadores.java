package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        // Operadores Aritmeticos = + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);

        // % - Resto de Divisao
        int resto = numero02 % 2;
        System.out.println(resto);

        // Operadores Relacionais = < > <= >= == != - Retorna True ou False
        boolean isDezMaiorQueVinte = 10 > 20; //Padrao Java comeca com is quando booleano
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // Operadores Logicos = && (AND / E) || (OR / OU) !
        int idade = 29;
        float salario = 3900F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel); // sout - Gera System.out.println

        // Operadores de Atribuicao - = (Recebe) +=(Soma e Recebe) -= (Subtrai e Recebe) *= (Multiplica e Recebe) /= (Dividi e Recebe) %= (Resto e Recebe)
        double bonus = 1800;
        bonus += 1000; // Atribui o valor de bonus e adiciona 1000 - bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus " + bonus);

        //
        int contador = 0;
        contador += 1;
        contador++; // contador = contador + 1 ou contador +=1
        contador--;
        ++contador;
        --contador;
        System.out.println("contador " + contador);
    }
}
