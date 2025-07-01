public class ClienteInvalidoException extends Exception {

    public ClienteInvalidoException() {
        super("Cliente inválido.");
    }

    public ClienteInvalidoException(String mensagem) {
        super(mensagem);
    }

    public ClienteInvalidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}