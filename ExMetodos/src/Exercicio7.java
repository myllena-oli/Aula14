import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        conversorDinheiro();
    }

    public static void conversorDinheiro() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a cotação atual do dólar? ");
        double cotacao = ler.nextDouble();
        System.out.println("Quantos dólares você tem para converter? ");
        double dolares = ler.nextDouble();
        double real = dolares * cotacao;
        System.out.printf("O valor convertido é R$" + "%.2f%s", real, ".");

    }
}