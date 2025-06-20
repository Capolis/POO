public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    protected ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {

        super(numeroConta, saldoInicial);
        setTaxaRendimento(taxaRendimento);
        
    }

    protected void renderJuros() {
        double rendimento = getSaldo() * (taxaRendimento / 100);
        depositar(rendimento);
        System.out.println("Juros de R$ " + rendimento + " aplicados.");
    }

    protected double getTaxaRendimento() {
        return taxaRendimento;
    }

    protected void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void aplicarJuros() {
        double novoSaldo = -(getSaldo() * 0.065)  + getSaldo();// Aplicando 6.5% de juros
        setSaldo(novoSaldo);
    }

}