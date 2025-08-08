import java.util.Scanner;

public class Aula05e06 {
    public static void main(String[] args) {
        final double PI = 3.1415;
        final int NUMERO_MAXIMO_TENTATIVAS = 10;
        double preco = 340.50;
        preco = 540.90;
       // Saída de Dados

        // Entrada de Dados: precisa-se de uma classe chamada Scanner
        // cria-se uma variável chamada input, e como importamos ela deve ser inicializada

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int numero = input.nextInt();

        System.out.println("O numero digitado foi " + numero);

    }
}
