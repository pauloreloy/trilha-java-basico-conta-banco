import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double totalSaques = 0;

        for(int i = 1;; i++) {
            double valorSaque = scanner.nextDouble();
            if(valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                System.exit(0);
            }
            if(valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                System.exit(0);
            }
            else {
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }

        }

    }
}