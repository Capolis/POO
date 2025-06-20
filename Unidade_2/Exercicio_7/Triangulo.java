public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;
    private double ladoA, ladoB, ladoC;

    protected Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {

        setBase(base);
        setAltura(altura);
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
        
    }

    protected void setBase(double base) {
        this.base = base;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }

    protected void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    protected void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    protected void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    protected double getBase() { return base; }
    protected double getAltura() { return altura; }

    @Override
    protected double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    protected double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}