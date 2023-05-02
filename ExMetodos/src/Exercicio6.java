import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        System.out.println("Temperatura: " + conversorTemperatura(ler.nextDouble()) + "º Fahrenheit. ");

    }

    public static double conversorTemperatura(double celsius) {

        double fahrenheit = (9 * celsius + 160) / 5;
        return fahrenheit;

    }
}