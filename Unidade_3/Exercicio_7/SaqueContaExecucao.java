import java.util.List;

public class SaqueContaExecucao {

    public static void executar(List<String> historico) {

        double saldoInicial, valorSaque;
        ContaBancariaEx7 conta;

        System.out.println("\n--- Exercício 7: Exceção de Saldo Insuficiente ---");
        System.out.print("Informe o saldo inicial da conta: ");
        saldoInicial = ExerciciosMenu.scanner.nextDouble();
        System.out.print("Informe o valor do saque: ");
        valorSaque = ExerciciosMenu.scanner.nextDouble();
        ExerciciosMenu.scanner.nextLine(); // limpar buffer
        conta = new ContaBancariaEx7(saldoInicial);
        try {
            conta.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso. Saldo restante: R$ " + conta.getSaldo());
            historico.add("Ex7: Saque de R$ " + valorSaque + " realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
            historico.add("Ex7: Tentativa de saque inválida - " + e.getMessage());
        }

    }

}