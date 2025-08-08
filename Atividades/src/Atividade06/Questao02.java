package Atividade06;

public class Questao02 {
    public static void main(String[] args) {
        Double preco_produto = 345.90;
        Double valor_disponivel = 400.00;
        final double TAXA_DESCONTO = 0.10;
        Double valor_desconto = preco_produto * TAXA_DESCONTO;
        Double preco_final = preco_produto - valor_desconto;
        Boolean resultado = valor_disponivel >= preco_final;

        if(resultado){
            System.out.printf("Compra permitida: %b", resultado);
        }
        else {
            System.out.printf("Compra permitida: %b", resultado);
        }
    }
}
