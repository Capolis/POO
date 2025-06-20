public class Calculadora {
    
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        return b != 0 ? (double) a / b : 0;
    }

    public double dividir(double a, double b) {
        return b != 0 ? a / b : 0;
    }
}