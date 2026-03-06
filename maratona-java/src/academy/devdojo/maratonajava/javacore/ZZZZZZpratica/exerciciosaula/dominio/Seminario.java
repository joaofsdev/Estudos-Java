package academy.devdojo.maratonajava.javacore.ZZZZZZpratica.exerciciosaula.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public void imprime() {
        System.out.println("---- Seminario ----");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if (this.alunos != null) {
            System.out.println("---- Alunos ----");
            for (Aluno aluno : alunos) {
                System.out.println("Aluno: " + aluno.getNome());
            }
            System.out.println("");
        }
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
