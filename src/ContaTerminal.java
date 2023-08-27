import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome e sobrenome: ");
        String NomeCliente = sc.nextLine();
        System.out.printf("Olá, %s. Por favor, digite o número da Agência: ", NomeCliente);
        String Agencia = sc.nextLine();
        System.out.println("Digite o número do seu usuário: ");
        int Numero = sc.nextInt();
        System.out.println("Digite o seu saldo atual: ");
        double Saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.",
                NomeCliente, Agencia, Numero, Saldo);
    }
}
