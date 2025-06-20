public class ContaBancariaExecucao {
    
    public static void executar() {

        System.out.println("Qual tipo de conta deseja criar?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int tipo = ExerciciosMenu.scanner.nextInt();
        ExerciciosMenu.scanner.nextLine();
        System.out.print("Número da conta: ");
        String numero = ExerciciosMenu.scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = ExerciciosMenu.scanner.nextDouble();

        switch (tipo) {
            case 1:
                System.out.print("Limite de crédito: ");
                double limite = ExerciciosMenu.scanner.nextDouble();
                ContaCorrente cc = new ContaCorrente(numero, saldo, limite);
                cc.usarChequeEspecial();
                break;
            case 2:
                System.out.print("Taxa de rendimento (%): ");
                double taxa = ExerciciosMenu.scanner.nextDouble();
                ContaPoupanca cp = new ContaPoupanca(numero, saldo, taxa);
                cp.renderJuros();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}