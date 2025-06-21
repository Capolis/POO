import java.util.List;

public class IdadeExecucao {

    public static void executar(List<String> historico) {

        int idade;

        System.out.println("\n--- Exercício 3: Validação de Idade ---");
        System.out.print("Digite sua idade: ");
        idade = ExerciciosMenu.scanner.nextInt();
        try {
            Idade.verificarIdade(idade);
            System.out.println("Idade válida.");
            historico.add("Ex3: Idade validada com sucesso: " + idade);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}