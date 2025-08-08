package Atividade06;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double MEDIA_APROVACAO = 7.0;
        Double media;

        System.out.print("Digite a 1ª nota: ");
        Double nota1 = input.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        Double nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Valor da média: %.1f \n", media);

        if(media >= MEDIA_APROVACAO){
            System.out.printf("Aprovado: " + true);
        }
        else {
            System.out.println("Aprovado: " + false);
        }

    }
}
