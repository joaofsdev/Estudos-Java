package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Maria");
        Professor p2 = new Professor("João");
        Professor[] professores = {p1, p2};

        Escola escola = new Escola("Escola Primaria", professores);

        escola.imprime();
    }
}
