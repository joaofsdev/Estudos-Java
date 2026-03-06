package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Maria";
        estudante1.idade = 17;
        estudante1.sexo = 'F';

        estudante2.nome = "Pedro";
        estudante2.idade = 18;
        estudante2.sexo = 'M';

        impressora.imprimirEstudante(estudante1);
        impressora.imprimirEstudante(estudante2);
    }
}
