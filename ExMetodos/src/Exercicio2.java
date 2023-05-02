import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println(nome());
    }

    public static String nome() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nomeDigitado = ler.nextLine();

        return ("Meu nome é " + nomeDigitado + ".");
    }
}