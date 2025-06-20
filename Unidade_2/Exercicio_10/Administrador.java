public class Administrador implements Autenticavel {

    private String login;
    private String senha;

    protected Administrador(String login, String senha) {

        setLogin(login);
        setSenha(senha);

    }

    protected void setLogin(String login) {
        this.login = login;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected String getLogin() {
        return login;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
}
