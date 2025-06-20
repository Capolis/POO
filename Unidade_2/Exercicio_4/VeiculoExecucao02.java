public class VeiculoExecucao02 {

    public static void executar() {
        System.out.println("Qual tipo de veículo deseja criar?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        int escolha = ExerciciosMenu.scanner.nextInt();
        ExerciciosMenu.scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = ExerciciosMenu.scanner.nextLine();
        System.out.print("Ano: ");
        int ano = ExerciciosMenu.scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Número de portas: ");
                int portas = ExerciciosMenu.scanner.nextInt();
                System.out.print("Possui ar-condicionado? (S/N): ");
                String ar = ExerciciosMenu.scanner.next();
                Carro carro = new Carro(modelo, ano, portas, ar.equalsIgnoreCase("S"));
                carro.imprimirInformacoes();
                break;
            case 2:
                System.out.print("Cilindradas: ");
                int cilindradas = ExerciciosMenu.scanner.nextInt();
                System.out.print("Possui partida elétrica? (S/N): ");
                String partida = ExerciciosMenu.scanner.next();
                Moto moto = new Moto(modelo, ano, cilindradas, partida.equalsIgnoreCase("S"));
                moto.imprimirInformacoes();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    
}