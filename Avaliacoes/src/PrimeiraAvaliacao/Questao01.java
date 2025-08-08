package PrimeiraAvaliacao;

/*Atividade 01 - Simulando um sistema escolar, crie um algoritmo em Java que receba do aluno as 8 notas anuais. O algoritmo deve calcular as médias bimestrais, as médias semestrais, e a média
final. Ao final dos cálculos, o algoritmo deve apresentar os resultados deforma clara.*/

public class Questao01 {
    public static void main(String[] args) {
        double n1 = 6.5;
        double n2 = 5.5;
        double n3 = 6.0;
        double n4 = 8.0;
        double n5 = 8.0;
        double n6 = 4.0;
        double n7 = 6.0;
        double n8 = 7.0;

        double mediaBimestre1 = (n1+n2) / 2;
        double mediaBimestre2 = (n3+n4) / 2;
        double mediaBimestre3 = (n5+n6) / 2;
        double mediaBimestre4 = (n7+n8) / 2;

        double semestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double semestre2 = (mediaBimestre3 + mediaBimestre4) / 2;

        System.out.println("=== Resultado Escolar ===");
        System.out.printf("1ºBimestre: %.2f \n", mediaBimestre1);
        System.out.printf("2ºBimestre: %.2f \n", mediaBimestre2);
        System.out.printf("1ºSemestre: %.2f \n", semestre1);
        System.out.println("-------------------------");
        System.out.printf("3ºBimestre: %.2f \n", mediaBimestre3);
        System.out.printf("4ºBimestre: %.2f \n", mediaBimestre4);
        System.out.printf("2ºSemestre: %.2f \n", semestre2);
        System.out.println("==========================");
    }

}
