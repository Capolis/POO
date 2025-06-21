import java.util.List;

public class LeituraArquivoExecucao {

    public static void executar(List<String> historico) {

        String caminho;

        System.out.println("\n--- Exercício 5: Leitura de Arquivo ---");
        System.out.print("Informe o caminho do arquivo: ");
        caminho = ExerciciosMenu.scanner.nextLine();

        try {
            LeitorArquivo.lerArquivo(caminho);
            historico.add("Ex5: Leitura do arquivo '" + caminho + "' concluída.");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado. Verifique o caminho.");
            historico.add("Ex5: Falha ao ler o arquivo '" + caminho + "'. Arquivo não encontrado.");
        }

    }

}