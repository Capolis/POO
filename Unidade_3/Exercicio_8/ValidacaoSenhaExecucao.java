import java.util.List;

public class ValidacaoSenhaExecucao {

    public static void executar(List<String> historico) {

        String senha;

        System.out.println("\n--- Exercício 8: Validação de Senha ---");
        System.out.print("Digite a senha para validação: ");
        senha = ExerciciosMenu.scanner.nextLine();
        try {
            ValidadorSenha.validarSenha(senha);
            System.out.println("Senha válida.");
            historico.add("Ex8: Senha validada com sucesso.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
            historico.add("Ex8: Senha inválida - " + e.getMessage());
        }

    }

}