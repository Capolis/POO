public class TrianguloExecucao {

    public static void executar() {

        if (ExerciciosMenu.trianguloSalvo != null) {
            System.out.print("Já existe um triângulo salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.trianguloSalvo = null;
            }
        }
        if (ExerciciosMenu.trianguloSalvo == null) {
            System.out.print("Digite a base do triângulo: ");
            double base = ExerciciosMenu.scanner.nextDouble();
            System.out.print("Digite a altura do triângulo: ");
            double altura = ExerciciosMenu.scanner.nextDouble();
            ExerciciosMenu.scanner.nextLine(); // limpar buffer
            ExerciciosMenu.trianguloSalvo = new Triangulo(base, altura);
        }
        Triangulo t = ExerciciosMenu.trianguloSalvo;
        System.out.println("Base: " + t.getBase());
        System.out.println("Altura: " + t.getAltura());
        System.out.printf("Área: %.2f\n", t.calcularArea());
    }

}

