import java.util.List;

public class DivisaoZeroExecucao {

    public static void executar(List<String> historico) {

        int num1, resultado;

        System.out.println("\n--- Exercício 4: Divisão por Zero com Feedback ao Usuário ---");
        System.out.print("Digite um número para tentar dividir por zero: ");
        num1 = ExerciciosMenu.scanner.nextInt();
        try {
            // operação proposital para lançar exceção
            resultado = num1 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            historico.add("Ex4: Número dividido por zero: " + num1);
        }
        
    }
}
