public class ContaCorrente extends ContaBancaria {

    private double limiteCredito;

    protected ContaCorrente(String numeroConta, double saldoInicial, double limiteCredito) {

        super(numeroConta, saldoInicial);
        setLimiteCredito(limiteCredito);

    }

    protected void usarChequeEspecial() {
        System.out.println("Usando o cheque especial de R$ " + limiteCredito);
    }

    protected double getLimiteCredito() {
        return limiteCredito;
    }

    protected void setLimiteCredito(double limiteCredito) {
        if (limiteCredito < 0) {
            System.out.println("Limite de crédito não pode ser negativo.");
            limiteCredito = 0;
        } else {
            this.limiteCredito = limiteCredito;
        }
    }

    @Override
    public void aplicarJuros() {
        double novoSaldo = -(getSaldo() * 0.15) + getSaldo();// Aplicando 15% de juros
        setSaldo(novoSaldo);
    }
    
}