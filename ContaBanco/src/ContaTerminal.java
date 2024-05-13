import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random rand = new Random();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor digite o número da sua agência: ");
        int agencia = scanner.nextInt();

        double saldo = rand.nextDouble() * 10000; // Assuming a random balance up to 10000

        System.out.printf("Olá %s, sua agência é %d e seu saldo é %.2f%n", nome, agencia, saldo);

        scanner.close(); // Close the scanner
    }
}

