import java.util.Scanner;

public class ContaTerminal {

    final static float saldoInicial = 237.48F;

    public static void main(String[] args) throws Exception {
        String mensagemSaida = solicitarDadosConta();
        System.out.println(mensagemSaida);
    }

    public static String solicitarDadosConta() {
        int numeroConta;
        float saldo;
        String agenciaConta, nomeCliente;
        Scanner scn = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        agenciaConta = scn.next();
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scn.nextInt();
        scn.nextLine();
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scn.nextLine();
        String mensagemSaida = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agenciaConta).concat(", conta ").concat(String.valueOf(numeroConta)).concat(" e seu saldo ").concat(String.valueOf(saldoInicial)).concat(" já está disponível para saque.");
        return mensagemSaida;
    }
}
