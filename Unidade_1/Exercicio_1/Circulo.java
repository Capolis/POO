public class Circulo {

    private double raio;

    protected Circulo(double raio) {
        setRaio(raio);
    }

    protected double calcularArea() {
        return Math.PI * raio * raio;
    }

    protected double calcularPerimetro() {
        return Math.PI * 2 * raio;
    }

// Getters e Setters

    protected double getRaio() {
        return raio;
    }

    protected void setRaio(double raio) {
        if(raio <= 0) {
            raio = 0;
            System.out.println("Raio inválido. O valor foi ajustado para 0.");
        } else {
            this.raio = raio;
        }
    }
}