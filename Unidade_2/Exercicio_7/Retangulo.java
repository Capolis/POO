public class Retangulo extends FormaGeometrica {

    private double largura;
    private double altura;

    protected Retangulo(double largura, double altura) {

        setLargura(largura);
        setAltura(altura);
        
    }

    protected void setLargura(double largura) {
        this.largura = largura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }

    protected double getLargura() {
        return largura;
    }

    protected double getAltura() {
        return altura;
    }

    @Override
    protected double calcularArea() {
        return largura * altura;
    }

    @Override
    protected double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}