public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void cumprimentar() {
        System.out.println("Olá " + nome + " você possui " + idade + " anos! Bem-vindo(a) ao evento!");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade inválida. O valor foi ajustado para 0.");
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }
}
