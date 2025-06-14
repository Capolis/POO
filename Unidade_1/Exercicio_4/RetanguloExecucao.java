public class RetanguloExecucao {

    public static void executar() {
        if (ExerciciosMenu.retanguloSalvo != null) {
            System.out.print("Já existe um retângulo salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.retanguloSalvo = null;
            }
        }
        if (ExerciciosMenu.retanguloSalvo == null) {
            System.out.print("Digite o comprimento: ");
            double comprimento = ExerciciosMenu.scanner.nextDouble();
            System.out.print("Digite a largura: ");
            double largura = ExerciciosMenu.scanner.nextDouble();
            ExerciciosMenu.scanner.nextLine(); // limpar buffer

            ExerciciosMenu.retanguloSalvo = new Retangulo(comprimento, largura);
        }

        Retangulo r = ExerciciosMenu.retanguloSalvo;
        System.out.println("Comprimento: " + r.getComprimento());
        System.out.println("Largura: " + r.getLargura());
        System.out.printf("Área: %.2f\n", r.calcularArea());
        System.out.printf("Perímetro: %.2f\n", r.calcularPerimetro());
    }
}