import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o seu Nome !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da sua conta !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        sc.close();
    }
}
