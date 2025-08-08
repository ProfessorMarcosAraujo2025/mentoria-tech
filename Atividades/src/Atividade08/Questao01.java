package Atividade08;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma temperatura em ºC: ");
        Double celsius = input.nextDouble();
        Double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("A temperatura de %.1f ºC representa %.1f Fahrenheit", celsius, fahrenheit);
    }
}
