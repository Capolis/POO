public class FormasGeometricasExecucao {

    public static void executar() {

        Circulo circulo = null;
        Retangulo retangulo = null;
        Triangulo triangulo = null;
        double raio, largura, alturaRet, base, alturaTri, ladoA, ladoB, ladoC;

        System.out.println("\n==== Cadastrar Formas Geométricas ====");
        System.out.println("Digite os dados das formas geométricas a seguir:");
        System.out.println("Círculo");
        System.out.print("Digite o raio do círculo: ");
        raio = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        circulo = new Circulo(raio);

        System.out.println("Retângulo");
        System.out.print("Digite a largura do retângulo: ");
        largura = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        System.out.print("Digite a altura do retângulo: ");
        alturaRet = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        retangulo = new Retangulo(largura, alturaRet);

        System.out.println("Triângulo");
        System.out.print("Digite a base do triângulo: ");
        base = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        System.out.print("Digite a altura do triângulo: ");
        alturaTri = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        System.out.print("Digite o lado A: ");
        ladoA = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        System.out.print("Digite o lado B: ");
        ladoB = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        System.out.print("Digite o lado C: ");
        ladoC = Double.parseDouble(ExerciciosMenu.scanner.nextLine());
        triangulo = new Triangulo(base, alturaTri, ladoA, ladoB, ladoC);

        System.out.println("\n==== Resultados ====");
        exibirForma("Círculo", circulo);
        exibirForma("Retângulo", retangulo);
        exibirForma("Triângulo", triangulo);
    }

    private static void exibirForma(String nome, FormaGeometrica forma) {
        System.out.printf("%s - Área: %.2f | Perímetro: %.2f%n",
                nome, forma.calcularArea(), forma.calcularPerimetro());
    }

}