public class Circulo extends FormaGeometrica {
    
    private double raio;

    protected Circulo(double raio) {
        setRaio(raio);
    }

    protected void setRaio(double raio) {
        this.raio = raio;
    }

    protected double getRaio() {
        return raio;
    }

    @Override
    protected double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    protected double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}