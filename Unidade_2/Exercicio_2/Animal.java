public class Animal {

    private String nome;
    private int idade;
    private String som;

    protected Animal(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    protected Animal(String nome, String som) {
        this(nome, 0); // Chama o construtor com idade padrão 0
        setSom(som);
    }

    protected void emitirSom() {
        System.out.println("O animal está emitindo um som genérico.");
    }

    protected void emitirSom(String som) {
        System.out.println("O animal está emitindo o som: " + som);
    }

    protected void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    // Getters e Setters
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        if(idade <= 0 ){
            idade = 0; // Definindo idade mínima como 0
        } else {
            this.idade = idade;
        }
    }

    protected void setSom(String som) {
        this.som = som;
    }

    protected String getSom() {
        return som;
    }
}