import java.util.List;

public class TransferenciaBancariaExecucao {

    public static void executar(List<String> historico) {

        double saldoA, saldoB, valor;
        ContaBancariaEx9 contaA, contaB;

        System.out.println("\n--- Exercício 9: Transferência Bancária com Validação ---");
        System.out.print("Informe o saldo da Conta A: ");
        saldoA = ExerciciosMenu.scanner.nextDouble();
        System.out.print("Informe o saldo da Conta B: ");
        saldoB = ExerciciosMenu.scanner.nextDouble();
        System.out.print("Informe o valor a transferir de A para B: ");
        valor = ExerciciosMenu.scanner.nextDouble();
        ExerciciosMenu.scanner.nextLine(); // limpar buffer
        contaA = new ContaBancariaEx9(saldoA);
        contaB = new ContaBancariaEx9(saldoB);
        try {
            contaA.transferir(contaB, valor);
            System.out.println("Transferência realizada com sucesso.");
            System.out.printf("Saldo A: R$ %.2f\n", contaA.getSaldo());
            System.out.printf("Saldo B: R$ %.2f\n", contaB.getSaldo());
            historico.add("Ex9: Transferência de R$ " + valor + " concluída com sucesso.");
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
            historico.add("Ex9: Falha na transferência - " + e.getMessage());
        }

    }

}