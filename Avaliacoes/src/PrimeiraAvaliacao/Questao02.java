package PrimeiraAvaliacao;

import java.util.Scanner;

/*Atividade 02 - Desenvolva um algoritmo em Java que receba como entrada
uma temperatura em graus Celsius (°C) digitada pelo usuário. O programa
deverá realizar a conversão dessa temperatura para as escalas Fahrenheit
(°F) e Kelvin (K), utilizando as seguintes fórmulas de conversão:
Fahrenheit (°F) = (Celsius (°C) × 9/5) + 32
Kelvin (K) = Celsius (°C) + 273.15

Ao final dos cálculos, o algoritmo deve exibir na tela o valor da temperatura
original em Celsius, juntamente com os valores convertidos em Fahrenheit e
Kelvin, de forma clara e informativa.*/

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da Temperatura em ºC: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        double kelvin = celcius + 273.15;

        System.out.println("==== Escalas de Temperaturas ====");
        System.out.printf("Temperatura em Celsius %.1f ºC \n", celcius);
        System.out.printf("Temperatura em Fahrenheit %.1f F \n", fahrenheit);
        System.out.printf("Temperatura em Kelvin %.1f K \n", kelvin);
        System.out.println("===================================");


    }
}
