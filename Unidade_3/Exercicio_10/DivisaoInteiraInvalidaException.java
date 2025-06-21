public class DivisaoInteiraInvalidaException extends Exception {

    public DivisaoInteiraInvalidaException() {
        super("Divisão inteira inválida: o divisor não pode ser zero.");
    }

    public DivisaoInteiraInvalidaException(String mensagem) {
        super(mensagem);
    }

    public DivisaoInteiraInvalidaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}