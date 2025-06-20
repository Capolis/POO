public class Usuario implements Autenticavel {

    private String nome;
    private String senha;

    protected Usuario(String nome, String senha) {

        setNome(nome);
        setSenha(senha);
        
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected String getNome() {
        return nome;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

}