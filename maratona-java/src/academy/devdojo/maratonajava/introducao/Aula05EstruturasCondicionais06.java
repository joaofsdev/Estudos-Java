package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        // utilizando switch e dados os valores de 1 a 7, informe se e dia util ou final de semana
        // considerando 1 como domingo

        byte dia = 2;

        switch(dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Informe um valor de 1 a 7");
                break;
        }
    }

}
