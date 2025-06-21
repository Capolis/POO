import java.util.List;

public class ConversorInteiroExecucao {

    public static void executar(List<String> historico) {

        String entrada;
        int numero;

        System.out.println("\n--- Exercício 6: Conversão de String para Inteiro ---");
        System.out.print("Digite um número: ");
        entrada = ExerciciosMenu.scanner.nextLine();
        try {
            numero = Integer.parseInt(entrada);
            System.out.println("Número convertido com sucesso: " + numero);
            historico.add("Ex6: Conversão bem-sucedida de '" + entrada + "' para " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inserido não é um número inteiro válido.");
            historico.add("Ex6: Falha ao converter '" + entrada + "' para inteiro.");
        }

    }

}
