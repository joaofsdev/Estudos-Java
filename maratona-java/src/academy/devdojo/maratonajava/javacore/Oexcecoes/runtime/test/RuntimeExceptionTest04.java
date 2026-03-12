package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
            return "Conexão Aberta!";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO...");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO...");
        }
    }
}
