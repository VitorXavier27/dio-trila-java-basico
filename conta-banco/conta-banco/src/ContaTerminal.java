import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Insira nome do cliente: ");
        String cliente = scanner.next();

        System.out.println("O seu saldo e de: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + cliente + " Obrigado por criar uma conta em nosso banco,sua agencia é "+ agencia + " conta "+ conta + " e seu saldo "+ saldo + " ja esta disponivel para saque.");
    }
}
