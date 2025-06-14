public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    protected Carro(String marca, String modelo, int ano) {

        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        this.ligado = false;

    }

    protected void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    protected void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    protected void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando...");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }

    // Getters e Setters
    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        if (ano < 1886) { // O primeiro carro foi inventado em 1886
            throw new IllegalArgumentException("Ano inválido para um carro.");
        }else{
            this.ano = ano;
        }
    }

    protected boolean isLigado() {
        return ligado;
    }
}