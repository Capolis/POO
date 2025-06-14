public class Produto {

    private String nome;
    private double preco;

    protected Produto(String nome, double preco) {

        setNome(nome);
        setPreco(preco);

    }

    protected double calcularPrecoComDesconto(double percentualDesconto) {
        return preco - (preco * percentualDesconto / 100.0);
    }

    // Getters e Setters
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        if (preco < 0) {
            preco = 0;
            System.out.println("Preço não pode ser negativo. Definido como 0.");
        }
        else {
            this.preco = preco;
        }
    }
}