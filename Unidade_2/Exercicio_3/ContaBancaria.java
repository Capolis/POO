public abstract class ContaBancaria {

    private double saldo;
    private String numeroConta;

    protected ContaBancaria(String numeroConta, double saldoInicial) {

        setNumeroConta(numeroConta);
        setSaldo(saldoInicial);

    }

    protected void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    protected void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    protected abstract void aplicarJuros();

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        if(saldo < 0) {
            System.out.println("Saldo não pode ser negativo.");
        } else {
            this.saldo = saldo;
        }
    }

    protected String getNumeroConta() {
        return numeroConta;
    }

    protected void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}