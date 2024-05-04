import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            int opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    double valorDeposito = scanner.nextInt();
                    saldo = saldo + valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextInt();
                    if(valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }
                    else {
                        saldo = saldo - valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}