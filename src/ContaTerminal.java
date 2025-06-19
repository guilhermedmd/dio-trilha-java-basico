import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        numero = input.nextInt();
        // input realizado para que o valor do enter não seja pego pelo next line da agência
        input.nextLine();
        System.out.println("Digite a Agência:");
        agencia = input.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = input.nextLine();
        System.out.println("Digite o saldo:");
        saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
