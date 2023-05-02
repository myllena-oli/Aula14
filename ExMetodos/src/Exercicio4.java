import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        System.out.println("O menor número digitado é: " + menor());
    }

    public static double menor() {
        Scanner ler = new Scanner(System.in);
        int quantidade;
        double numeros[], menorNumero;

        System.out.println("Quantos números você quer digitar? ");
        quantidade = ler.nextInt();
        numeros = new double[quantidade];

        for (int i=0; i<numeros.length;i++) {
            System.out.println("Digite o "+(i+1)+"º número: ");
            numeros[i]=ler.nextDouble();
        }
        menorNumero=numeros[0];

        for (int i=0; i<numeros.length;i++) {
            if (menorNumero>numeros[i]){
                menorNumero=numeros[i];
            }
        }
        return menorNumero;
    }
}