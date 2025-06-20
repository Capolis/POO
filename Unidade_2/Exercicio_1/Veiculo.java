public class Veiculo {

    private String modelo;
    private int ano;

    protected Veiculo(String modelo, int ano) {

        setModelo(modelo);
        setAno(ano);

    }


    protected void imprimirInformacoes() {
        System.out.println("Veículo - Modelo: " + modelo + ", Ano: " + ano);
    }

    // Getters e Setters
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
        if(ano < 1886) { // O primeiro carro foi inventado em 1886
            ano = 1886; // Definindo ano mínimo como 1886
            System.out.println("Ano inválido. Definindo ano mínimo como 1886.");
        } else {
            this.ano = ano;
        }
    }
}