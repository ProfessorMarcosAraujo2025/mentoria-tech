package Atividade06;

public class Questao03 {
    public static void main(String[] args) {
        Integer idade = 19;
        Double peso = 50.6;
        final int PESO_MINIMO = 50;
        Boolean resultado = idade >= 18 && peso >= 50;

        if(resultado){
            System.out.printf("Apto para doar: %b", resultado);
        }
        else{
            System.out.printf("Apto para doar: %b", resultado);
        }

    }
}
