package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.test;

import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio.Local;
import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio.Seminario;

public class AlunoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua dos Seminarios 1001");
        Seminario seminario = new Seminario("Seminario", local);
        Aluno aluno = new Aluno("João", 20, seminario);

        Aluno[] alunos = {aluno};
        aluno.imprime();

        seminario.setAlunos(alunos);
        seminario.imprime();
    }
}
