import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        calculoImc();
    }

    public static void calculoImc() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a sua altura em metros? ");
        double altura = ler.nextDouble();
        System.out.println("Qual o seu peso em quilos? ");
        double peso = ler.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Usuário se encontra em classificação de peso: magreza.");
        } else if (imc < 24.9) {
            System.out.println("Usuário se encontra em classificação de peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Usuário se encontra em classificação de peso: sobrepeso.");
        } else if (imc < 39.9) {
            System.out.println("Usuário se encontra em classificação de peso: obesidade.");
        } else {
            System.out.println("Usuário se encontra em classificação de peso: obesidade grave.");
        }
    }
}