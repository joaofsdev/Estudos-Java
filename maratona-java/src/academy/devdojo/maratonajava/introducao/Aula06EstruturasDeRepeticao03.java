package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de 0 a 50;
        for (int i = 0; i <= 50; i++) {
            if (i <= 25) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
