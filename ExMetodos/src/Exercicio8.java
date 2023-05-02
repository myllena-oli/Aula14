import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        precoProduto();
    }

    public static void precoProduto() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o preço de custo do produto? ");
        double precoCusto = ler.nextDouble();
        System.out.println("Qual a porcentagem de acréscimo do valor para venda? ");
        double porcentagem = ler.nextDouble();
        double valorVenda = precoCusto + (precoCusto * porcentagem / 100);
        System.out.printf("O valor de venda é R$" + "%.2f%s", valorVenda, ".");

    }
}