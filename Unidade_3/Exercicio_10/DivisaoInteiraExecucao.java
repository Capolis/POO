import java.util.List;

public class DivisaoInteiraExecucao {

    public static void executar(List<String> historico) {

        int dividendo, divisor, resultado;

        System.out.println("\n--- Exercício 10: Divisão Inteira com Controle de Exatidão ---");
        System.out.print("Digite o dividendo (número a ser dividido): ");
        dividendo = ExerciciosMenu.scanner.nextInt();
        System.out.print("Digite o divisor: ");
        divisor = ExerciciosMenu.scanner.nextInt();
        ExerciciosMenu.scanner.nextLine(); // limpar buffer
        try {
            resultado = DivisaoInteira.dividir(dividendo, divisor);
            System.out.println("Resultado da divisão exata: " + resultado);
            historico.add("Ex10: " + dividendo + " / " + divisor + " = " + resultado);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
            historico.add("Ex10: Divisão inválida - " + e.getMessage());
        }

    }

}