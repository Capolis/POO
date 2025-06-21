public class TransferenciaInvalidaException extends Exception {

    protected TransferenciaInvalidaException() {
        super("Transferência inválida.");
    }

    protected TransferenciaInvalidaException(String mensagem) {
        super(mensagem);
    }

    protected TransferenciaInvalidaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}
