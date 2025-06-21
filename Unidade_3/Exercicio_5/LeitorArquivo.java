import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorArquivo {

    protected static void lerArquivo(String caminho) throws FileNotFoundException {

        File arquivo;
        Scanner leitor;

        arquivo = new File(caminho);
        leitor = new Scanner(arquivo);

        System.out.println("--- Conteúdo do Arquivo ---");
        while (leitor.hasNextLine()) {
            System.out.println(leitor.nextLine());
        }
        leitor.close();
        
    }

}