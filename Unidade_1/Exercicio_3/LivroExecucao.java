public class LivroExecucao {

    public static void executar() {
        
        if (ExerciciosMenu.livroSalvo != null) {
            System.out.print("Já existe um livro salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.livroSalvo = null;
            }
        }
        if (ExerciciosMenu.livroSalvo == null) {
            System.out.print("Digite o título do livro: ");
            String titulo = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autor = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o número de páginas: ");
            int paginas = ExerciciosMenu.scanner.nextInt();
            ExerciciosMenu.scanner.nextLine(); // limpar buffer
            ExerciciosMenu.livroSalvo = new Livro(titulo, autor, paginas);
        }
        ExerciciosMenu.livroSalvo.exibirDetalhes();
    }
}