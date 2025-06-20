import java.util.Scanner;

public class ExerciciosMenu {

    public static Scanner scanner = new Scanner(System.in);

    // Instâncias salvas

    
    public static void main(String[] args) {
        
        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1  - Exercício Veículos 01");
            System.out.println("2  - Exercício Animais 01");
            System.out.println("3  - Exercício Conta Bancária com Herança");
            System.out.println("4  - Exercício Veículos 02");
            System.out.println("5  - Exercício Animais 02");
            System.out.println("6  - Exercício Calculadora");
            System.out.println("7  - Exercício Formas Geométricas e Cálculo de Áreas");
            System.out.println("8  - Exercício Sons de Animais");
            System.out.println("9  - Exercício Aplicação de Juros em Contas Bancárias");
            System.out.println("10 - Exercício Autenticação de Usuários");
            System.out.println("0  - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    VeiculoExecucao01.executar();
                    break;
                case 2:
                    AnimalExecucao01.executar();
                    break;
                case 3:
                    ContaBancariaExecucao.executar();
                    break;
                case 4:
                    VeiculoExecucao02.executar();
                    break;
                case 5:
                    AnimalExecucao02.executar();
                    break;
                case 6:
                    CalculadoraExecucao.executar();
                    break;
                case 7:
                    FormasGeometricasExecucao.executar();
                    break;
                case 8:
                    ListaSonsExecucao.executar();
                    break;
                case 9:
                    AplicacaoJurosExecucao.executar();
                    break;
                case 10:
                    AutenticacaoExecucao.executar();
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