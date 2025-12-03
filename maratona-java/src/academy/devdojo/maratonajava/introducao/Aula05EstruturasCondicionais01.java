package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >=18;
        if(isAutorizadoComprarBebida){
            System.out.println("Pode Comprar Bebida Alcoolica");
        }else {
            System.out.println("Nao Pode Comprar Bebida Alcoolica");
        }
    }
}
