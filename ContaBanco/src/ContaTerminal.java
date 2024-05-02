import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    int numeroDaConta;
    String agencia, nomeDoCliente;
    double saldo;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o seu nome:");
    nomeDoCliente = scanner.next();
    System.out.println("Por favor, digite o número da conta:");
    numeroDaConta = scanner.nextInt();
    System.out.println("Por favor, digite a agência:");
    agencia = scanner.next();
    System.out.println("Por favor, digite o saldo da conta:");
    saldo = scanner.nextDouble();

    System.out.println("Olá ".concat(nomeDoCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ") + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

    scanner.close();
  }
}
