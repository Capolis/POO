public class VeiculoJaCadastradoException extends Exception {

    public VeiculoJaCadastradoException() {
        super("Veículo já cadastrado.");
    }
    public VeiculoJaCadastradoException(String mensagem) {
        super(mensagem);
    }

    public VeiculoJaCadastradoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}