public class AnimalExecucao {

    public static void executar() {

        if (ExerciciosMenu.animalSalvo != null) {
            System.out.print("Já existe um animal salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.animalSalvo = null;
            }
        }
        if (ExerciciosMenu.animalSalvo == null) {
            System.out.print("Digite o nome do animal: ");
            String nome = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o tipo de alimentação: ");
            String alimentacao = ExerciciosMenu.scanner.nextLine();
            ExerciciosMenu.animalSalvo = new Animal(nome, alimentacao);
        }
        System.out.println("Nome: " + ExerciciosMenu.animalSalvo.getNome());
        System.out.println("Tipo de alimentação: " + ExerciciosMenu.animalSalvo.getTipoAlimentacao());
        ExerciciosMenu.animalSalvo.emitirSom();
    }

}