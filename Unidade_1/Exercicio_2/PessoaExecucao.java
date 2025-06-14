public class PessoaExecucao {

    public static void executar() {
        if (ExerciciosMenu.pessoaSalva != null) {
            System.out.print("Já existe uma pessoa salva. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.pessoaSalva = null;
            }
        }

        if (ExerciciosMenu.pessoaSalva == null) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            int idade = ExerciciosMenu.scanner.nextInt();
            ExerciciosMenu.scanner.nextLine(); // Limpar buffer
            ExerciciosMenu.pessoaSalva = new Pessoa(nome, idade);
        }

        ExerciciosMenu.pessoaSalva.cumprimentar();
    }
}
