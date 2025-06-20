import java.util.ArrayList;
import java.util.List;

public class AutenticacaoExecucao {

    private static List<Autenticavel> autenticaveis = new ArrayList<>();

    public static void executar() {

        String tipo, nome, senha, login, tentativa, id;
        boolean autenticado;

        System.out.print("Quantos usuários/administradores deseja cadastrar? ");
        int qtd = Integer.parseInt(ExerciciosMenu.scanner.nextLine());

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Cadastro %d:%n", i + 1);
            System.out.print("Tipo (usuario/administrador): ");
            tipo = ExerciciosMenu.scanner.nextLine().trim().toLowerCase();

            if (tipo.equals("usuario")) {
                System.out.print("Nome: ");
                nome = ExerciciosMenu.scanner.nextLine();
                System.out.print("Senha: ");
                senha = ExerciciosMenu.scanner.nextLine();
                autenticaveis.add(new Usuario(nome, senha));
            } else if (tipo.equals("administrador")) {
                System.out.print("Login: ");
                login = ExerciciosMenu.scanner.nextLine();
                System.out.print("Senha: ");
                senha = ExerciciosMenu.scanner.nextLine();
                autenticaveis.add(new Administrador(login, senha));
            } else {
                System.out.println("Tipo inválido.");
            }
        }

        System.out.println("\n=== Testar Autenticação ===");
        for (Autenticavel a : autenticaveis) {
            id = (a instanceof Usuario u) ? u.getNome() : ((Administrador) a).getLogin();
            System.out.printf("Autenticar %s. Digite a senha: ", id);
            tentativa = ExerciciosMenu.scanner.nextLine();
            autenticado = a.autenticar(tentativa);
            System.out.printf("%s: %s%n", id, autenticado ? "Autenticado com sucesso" : "Falha na autenticação");
        }
    }

}