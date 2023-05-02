import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        calculoSalario();
    }

    public static void calculoSalario() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nomeVendedor = ler.nextLine();
        System.out.println("Qual o seu salário fixo? ");
        double salarioFixo = ler.nextDouble();
        System.out.println("Qual o seu total de vendas, no mês, em dinheiro? ");
        double valorVendas = ler.nextDouble();
        double comissao = valorVendas + (valorVendas * 15 / 100);

        System.out.println("Nome: " + nomeVendedor);
        System.out.printf("Salário Fixo: R$" + "%.2f%n", salarioFixo);
        System.out.printf("Salário Final: R$" + "%.2f%n", (comissao + salarioFixo));

    }
}