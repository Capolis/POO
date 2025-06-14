public class ContaBancaria {

    private String numeroConta;
    private double saldo;

    protected ContaBancaria(String numeroConta, double saldoInicial) {

        setNumeroConta(numeroConta);
        setSaldo(saldoInicial);

    }

    protected void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    protected void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saque não autorizado: saldo insuficiente ou valor inválido.");
        }
    }

    // Getters e Setters
    protected String getNumeroConta() {
        return numeroConta;
    }

    protected void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        if(saldo < 0) {
            System.out.println("Saldo inválido.");
        } else {
        this.saldo = saldo;
        }
    }

}