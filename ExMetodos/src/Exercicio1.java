import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int resultado = soma();
        System.out.println(resultado);
    }

    public static int soma() {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite um número inteiro: ");
        int numero = ler.nextInt();
        for (int i = 0; i <= numero; i++) {
            soma = soma + i;
        }
        return soma;

    }
}