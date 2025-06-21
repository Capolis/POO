public class DivisaoInteira {

    protected static int dividir(int dividendo, int divisor) throws DivisaoInteiraInvalidaException {

        if (divisor == 0) {
            throw new DivisaoInteiraInvalidaException("Não é possível dividir por zero.");
        }
        if (dividendo % divisor != 0) {
            throw new DivisaoInteiraInvalidaException("A divisão não é exata.");
        }
        if (dividendo < 0 || divisor < 0) {
            throw new DivisaoInteiraInvalidaException("Divisão deve ser feita com números inteiros positivos.");
        }
        if (dividendo == 0) {
            return 0; // Divisão de zero por qualquer número é zero
        }

        return dividendo / divisor;
    }

}