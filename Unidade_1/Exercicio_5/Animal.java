public class Animal {

    private String nome;
    private String tipoAlimentacao;

    protected Animal(String nome, String tipoAlimentacao) {

        setNome(nome);
        setTipoAlimentacao(tipoAlimentacao);
        
    }

    protected void emitirSom() {
        System.out.println(nome + " está emitindo um som característico!");
    }

    // Getters e Setters
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    protected void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
}