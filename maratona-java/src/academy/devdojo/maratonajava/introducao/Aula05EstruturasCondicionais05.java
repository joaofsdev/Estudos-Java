package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo;
        byte dia = 1;

        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terca-Feita");
                break;
            case 4:
                System.out.println("Quarta-Feita");
                break;
            case 5:
                System.out.println("Quinta-Feita");
                break;
            case 6:
                System.out.println("Sexta-Feita");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Informe um caso valido");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Informe um M ou F");
                break;
        }
    }
}
