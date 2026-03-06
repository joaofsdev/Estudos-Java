package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.test;

import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio.Local;
import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio.Professor;
import academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio.Seminario;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua dos Seminarios 1001");
        Seminario seminario = new Seminario("Rua dos Seminarios", local);
        Professor professor = new Professor("Robson", "Geografia");

        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
