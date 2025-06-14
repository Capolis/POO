public class CarroExecucao {

    public static void executar() {

        if (ExerciciosMenu.carroSalvo != null) {
            System.out.print("Já existe um carro salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.carroSalvo = null;
            }
        }
        if (ExerciciosMenu.carroSalvo == null) {
            System.out.print("Digite a marca do carro: ");
            String marca = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o modelo do carro: ");
            String modelo = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o ano do carro: ");
            int ano = ExerciciosMenu.scanner.nextInt();
            ExerciciosMenu.scanner.nextLine(); // Limpar buffer

            ExerciciosMenu.carroSalvo = new Carro(marca, modelo, ano);
        }
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menu Carro ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            int opcao = ExerciciosMenu.scanner.nextInt();
            ExerciciosMenu.scanner.nextLine(); // Limpar buffer
            switch (opcao) {
                case 1:
                    ExerciciosMenu.carroSalvo.ligar();
                    break;
                case 2:
                    ExerciciosMenu.carroSalvo.desligar();
                    break;
                case 3:
                    ExerciciosMenu.carroSalvo.acelerar();
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