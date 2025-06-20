public class VeiculoExecucao01 {

    public static void executar() {

        System.out.println("Qual tipo de veículo deseja criar?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        int escolha = ExerciciosMenu.scanner.nextInt();
        ExerciciosMenu.scanner.nextLine();

        if (escolha == 1) {
            System.out.print("Modelo: ");
            String modelo = ExerciciosMenu.scanner.nextLine();
            System.out.print("Ano: ");
            int ano = ExerciciosMenu.scanner.nextInt();
            System.out.print("Número de portas: ");
            int portas = ExerciciosMenu.scanner.nextInt();
            System.out.print("Possui ar-condicionado? (S/N): ");
            boolean ar;
            if(ExerciciosMenu.scanner.nextLine().equalsIgnoreCase("S")) {
                ar = true;
            } else {
                ar = false;
            }
            ExerciciosMenu.scanner.nextLine();
            Carro carro = new Carro(modelo, ano, portas, ar);
            System.out.println("Carro criado com sucesso!");
            carro.ligarSom();
        } else if (escolha == 2) {
            System.out.print("Modelo: ");
            String modelo = ExerciciosMenu.scanner.nextLine();
            System.out.print("Ano: ");
            int ano = ExerciciosMenu.scanner.nextInt();
            System.out.print("Cilindradas: ");
            int cilindradas = ExerciciosMenu.scanner.nextInt();
            System.out.print("Possui partida elétrica? (S/N): ");
            boolean partida;
            if(ExerciciosMenu.scanner.nextLine().equalsIgnoreCase("S")) {
                partida = true;
            } else {
                partida = false;
            }
            ExerciciosMenu.scanner.nextLine();
            Moto moto = new Moto(modelo, ano, cilindradas, partida);
            System.out.println("Moto criada com sucesso!");
            moto.empinar();
        } else {
            System.out.println("Opção inválida.");
        }
    }

}