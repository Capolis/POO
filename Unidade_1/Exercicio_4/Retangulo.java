public class Retangulo {

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    // Getters e Setters
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento <= 0) {
            comprimento = 1;
            System.out.println("Comprimento inválido. Definindo como 1.");
        }
        else {
            this.comprimento = comprimento;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura <= 0) {
            largura = 1;
            System.out.println("Largura inválida. Definindo como 1.");
        }
        else {
            this.largura = largura;
        }
    }
}