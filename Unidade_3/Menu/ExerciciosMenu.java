import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosMenu {

    public static Scanner scanner = new Scanner(System.in);
    private static List<String> historico = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1.  Divisão e Validação de Entradas");
            System.out.println("2.  Conversão de Temperatura");
            System.out.println("3.  Validação de Idade");
            System.out.println("4.  Divisão por Zero com Feedback ao Usuário");
            System.out.println("5.  Leitura de Arquivo");
            System.out.println("6.  Conversão de String para Inteiro");
            System.out.println("7.  Exceção de Saldo Insuficiente");
            System.out.println("8.  Validação de Senha");
            System.out.println("9.  Validação de Transferências Bancárias");
            System.out.println("10. Divisão Inteira com Controle de Exatidão");
            System.out.println("11. Limpar Histórico");
            System.out.println("12. Histórico de Resultados:");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    DivisaoExecucao.executar(historico);
                    break;
                case 2:
                    ConversorTemperaturaExecucao.executar(historico);
                    break;
                case 3:
                    IdadeExecucao.executar(historico);
                    break;
                case 4:
                    DivisaoZeroExecucao.executar(historico);
                    break;
                case 5:
                    LeituraArquivoExecucao.executar(historico);
                    break;
                case 6:
                    ConversorInteiroExecucao.executar(historico);
                    break;
                case 7:
                    SaqueContaExecucao.executar(historico);
                    break;
                case 8:
                    ValidacaoSenhaExecucao.executar(historico);
                    break;
                case 9:
                    TransferenciaBancariaExecucao.executar(historico);
                    break;
                case 10:
                    DivisaoInteiraExecucao.executar(historico);
                    break;
                case 11:
                    historico.clear();
                    System.out.println("Histórico limpo.");
                    break;
                case 12:
                    System.out.println("\n--- Histórico de Resultados ---");
                    if (historico.isEmpty()) {
                        System.out.println("Nenhum resultado registrado.");
                    } else {
                        for (String resultado : historico) {
                            System.out.println(resultado);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

}