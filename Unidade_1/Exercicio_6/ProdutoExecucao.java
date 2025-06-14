public class ProdutoExecucao {

    public static void executar() {

        if (ExerciciosMenu.produtoSalvo != null) {
            System.out.print("Já existe um produto salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.produtoSalvo = null;
            }
        }
        if (ExerciciosMenu.produtoSalvo == null) {
            System.out.print("Digite o nome do produto: ");
            String nome = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = ExerciciosMenu.scanner.nextDouble();
            ExerciciosMenu.scanner.nextLine(); // Limpar buffer

            ExerciciosMenu.produtoSalvo = new Produto(nome, preco);
        }
        Produto p = ExerciciosMenu.produtoSalvo;
        System.out.println("Nome: " + p.getNome());
        System.out.printf("Preço original: R$ %.2f\n", p.getPreco());
        System.out.print("Digite o percentual de desconto: ");
        double desconto = ExerciciosMenu.scanner.nextDouble();
        ExerciciosMenu.scanner.nextLine();
        double precoComDesconto = p.calcularPrecoComDesconto(desconto);
        System.out.printf("Preço com %.2f%% de desconto: R$ %.2f\n", desconto, precoComDesconto);
    }
    
}