import java.util.Scanner;

public class ExerciciosMenu {

    public static Scanner scanner = new Scanner(System.in);

    // Instâncias salvas
    public static Circulo circuloSalvo;
    public static Pessoa pessoaSalva;
    public static Livro livroSalvo;
    public static Retangulo retanguloSalvo;
    public static Animal animalSalvo;
    public static Produto produtoSalvo;
    public static Triangulo trianguloSalvo;
    public static ContaBancaria contaSalva;
    public static Carro carroSalvo;
    public static Funcionario funcionarioSalvo;
    
    public static void main(String[] args) {
        
        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Exercício Círculo");
            System.out.println("2 - Exercício Pessoa");
            System.out.println("3 - Exercício Livro");
            System.out.println("4 - Exercício Retângulo");
            System.out.println("5 - Exercício Animal");
            System.out.println("6 - Exercício Produto");
            System.out.println("7 - Exercício Triângulo");
            System.out.println("8 - Exercício Conta Bancária");
            System.out.println("9 - Exercício Carro");
            System.out.println("10 - Exercício Funcionário");
            System.out.println("0 - Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    CirculoExecucao.executar();
                    break;
                case 2:
                    PessoaExecucao.executar();
                    break;
                case 3:
                    LivroExecucao.executar();
                    break;
                case 4:
                    RetanguloExecucao.executar();
                    break;
                case 5:
                    AnimalExecucao.executar();
                    break;
                case 6:
                    ProdutoExecucao.executar();
                    break;
                case 7:
                    TrianguloExecucao.executar();
                    break;
                case 8:
                    ContaBancariaExecucao.executar();
                    break;
                case 9:
                    CarroExecucao.executar();
                    break;
                case 10:
                    FuncionarioExecucao.executar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

}