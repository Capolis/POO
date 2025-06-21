public class ContaBancariaEx7 {

    private double saldo;

    protected ContaBancariaEx7(double saldoInicial) {

        setSaldo(saldoInicial);

    }

    protected void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Você tentou sacar R$ " + valor + ", mas tem apenas R$ " + saldo);
        }
        saldo -= valor;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("O saldo não pode ser negativo.");
            System.out.println("--- Sistema indisponível ---");
            System.out.println("Tente novamente mais tarde.");
        }
        else{
            this.saldo = saldo;
        }
    }
}