public class ContaBancariaEx9 {

    private double saldo;

    public ContaBancariaEx9(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    protected void transferir(ContaBancariaEx9 destino, double valor) throws TransferenciaInvalidaException {
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("Valor da transferência deve ser maior que zero.");
        }
        if (valor > saldo) {
            throw new TransferenciaInvalidaException("Saldo insuficiente para transferência.");
        }
        this.saldo -= valor;
        destino.saldo += valor;
    }

    protected double getSaldo() {
        return saldo;
    }
    protected void setSaldo(double saldo) {
        if(saldo < 0) {
            System.out.println("Saldo não pode ser negativo.");
            System.out.println("--- Sistema indisponível ---");
            System.out.println("Não tente novamente mais tarde.");
        } else {
            this.saldo = saldo;
        }
    }
}
