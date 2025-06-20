public class CalculadoraExecucao {

    public static void executar() {

        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double a = ExerciciosMenu.scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = ExerciciosMenu.scanner.nextDouble();
        System.out.println("Soma: " + calc.somar(a, b));
        System.out.println("Subtração: " + calc.subtrair(a, b));
        System.out.println("Multiplicação: " + calc.multiplicar(a, b));
        System.out.println("Divisão: " + calc.dividir(a, b));
    }

}