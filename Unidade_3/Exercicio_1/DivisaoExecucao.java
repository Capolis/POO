import java.util.List;

public class DivisaoExecucao {

    public static void executar(List<String> historico) {

        double num1 = 0, num2 = 0;

        System.out.println("\n--- Exercício 1: Divisão com Validação ---");
        System.out.print("Digite o primeiro número: ");
        num1 = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        System.out.print("Digite o segundo número: ");
        num2 = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        realizarDivisao(num1, num2, historico);
    }
    
    private static void realizarDivisao(double num1, double num2, List<String> historico) {
        
        try {
            if (num2 == 0){
                throw new ArithmeticException("Divisão por zero não é permitida.");
            } else {
                System.out.printf("Resultado: %.2f%n", num1 / num2);
                historico.add("Ex1: " + num1 + " / " + num2 + " = " + num1 / num2); // Adiciona o resultado ao histórico
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}