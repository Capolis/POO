import java.util.ArrayList;
import java.util.List;

public class AplicacaoJurosExecucao {

    private static List<ContaBancaria> contas = new ArrayList<>();

    public static void executar() {

        String numero, tipo;
        double saldo;
        ContaBancaria conta;

        System.out.print("Quantas contas deseja adicionar? ");
        int qtd = Integer.parseInt(ExerciciosMenu.scanner.nextLine());

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Conta %d:%n", i + 1);
            System.out.print("Número da conta: ");
            numero = ExerciciosMenu.scanner.nextLine();
            System.out.print("Saldo inicial: ");
            saldo = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
            System.out.print("Tipo (corrente/poupanca): ");
            tipo = ExerciciosMenu.scanner.nextLine().trim().toLowerCase();

            if (tipo.equals("corrente")) {
                conta = new ContaCorrente(numero, saldo, 1000.0);
            } else if (tipo.equals("poupanca")) {
                conta = new ContaPoupanca(numero, saldo, 5.0);
            } else {
                System.out.println("Tipo inválido. Pulando...");
                continue;
            }

            conta.aplicarJuros();
            contas.add(conta);
        }

        System.out.println("\n=== Contas com juros aplicados ===");
        for (ContaBancaria cont : contas) {
            System.out.printf("Conta %s - Saldo final: %.2f%n", cont.getNumeroConta(), cont.getSaldo());
        }
        
    }

}
