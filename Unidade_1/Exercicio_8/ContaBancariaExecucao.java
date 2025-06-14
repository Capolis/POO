public class ContaBancariaExecucao {

    public static void executar() {

        if (ExerciciosMenu.contaSalva != null) {
            System.out.print("Já existe uma conta salva. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.contaSalva = null;
            }
        }
        if (ExerciciosMenu.contaSalva == null) {
            System.out.print("Digite o número da conta: ");
            String numeroConta = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = ExerciciosMenu.scanner.nextDouble();
            ExerciciosMenu.scanner.nextLine(); // limpar buffer
            ExerciciosMenu.contaSalva = new ContaBancaria(numeroConta, saldoInicial);
        }
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menu Conta Bancária ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            int opcao = ExerciciosMenu.scanner.nextInt();
            ExerciciosMenu.scanner.nextLine(); // limpar buffer
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double deposito = ExerciciosMenu.scanner.nextDouble();
                    ExerciciosMenu.scanner.nextLine();
                    ExerciciosMenu.contaSalva.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double saque = ExerciciosMenu.scanner.nextDouble();
                    ExerciciosMenu.scanner.nextLine();
                    ExerciciosMenu.contaSalva.sacar(saque);
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", ExerciciosMenu.contaSalva.getSaldo());
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    
}