public class CirculoExecucao {

    public static void executar() {

        // Verifica se já existe um círculo salvo
        if (ExerciciosMenu.circuloSalvo != null) {
            System.out.print("Já existe um círculo salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.circuloSalvo = null;
            }
        }
        // Se não houver círculo salvo, solicita o raio
        if (ExerciciosMenu.circuloSalvo == null) {
            System.out.print("Digite o raio do círculo: ");
            double raio = ExerciciosMenu.scanner.nextDouble();
            ExerciciosMenu.scanner.nextLine(); // Limpar buffer
            ExerciciosMenu.circuloSalvo = new Circulo(raio);
        }

        Circulo c = ExerciciosMenu.circuloSalvo;
        System.out.println("Raio: " + c.getRaio());
        System.out.printf("Área: %.2f\n", c.calcularArea());
        System.out.printf("Perímetro: %.2f\n", c.calcularPerimetro());

    }
}
