import java.util.ArrayList;
import java.util.List;

public class ListaSonsExecucao {

    public static void executar() {

        List<Animal> animais = new ArrayList<>();
        String nome, som, tipo;
        Animal animal;

        System.out.print("Quantos animais deseja adicionar? ");
        int quantidade = Integer.parseInt(ExerciciosMenu.scanner.nextLine());

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Animal %d:%n", i + 1);
            System.out.print("Nome: ");
            nome = ExerciciosMenu.scanner.nextLine();
            System.out.print("Tipo (mamifero, ave, peixe): ");
            tipo = ExerciciosMenu.scanner.nextLine().trim().toLowerCase();
            System.out.print("Qual o som que ele faz? ");
            som = ExerciciosMenu.scanner.nextLine().trim();

            switch (tipo) {
                case "mamifero" -> animal = new Mamifero(nome, som);
                case "ave" -> animal = new Ave(nome, som);
                case "peixe" -> animal = new Peixe(nome, som);
                default -> {
                    System.out.println("Tipo desconhecido. Usando tipo genérico.");
                    animal = new Animal(nome, som);
                }
            }
            animais.add(animal);
        }

        System.out.println("\n=== Sons dos Animais ===");
        for (Animal ani : animais) {
            ani.emitirSom(ani.getSom());
        }

    }

}