public class SenhaInvalidaException extends Exception {

    protected SenhaInvalidaException() {
        super("Senha inválida.");
    }

    protected SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }

    protected SenhaInvalidaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}