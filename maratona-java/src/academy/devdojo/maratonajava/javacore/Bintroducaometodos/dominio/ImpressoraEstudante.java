package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante){
        System.out.println("Nome: " + estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
    }
}
