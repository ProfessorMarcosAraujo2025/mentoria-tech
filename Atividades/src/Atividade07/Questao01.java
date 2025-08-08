package Atividade07;

public class Questao01 {
    public static void main(String[] args) {
        String time_favorito = "Flamengo";
        Integer titulos_estadual = 39;
        Integer titulos_sao_paulo = 22;
        Boolean resultado = titulos_estadual > titulos_sao_paulo;

        System.out.printf("Time favorito: %s \n", time_favorito);
        System.out.printf("Títulos estadual: %d \n", titulos_estadual);
        System.out.printf("Tem mais título do que o São Paulo? %b", resultado);

    }
}
