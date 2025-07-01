public class Onibus extends Veiculo {

    private int nPassageiros;
    private String tipoOnibus;

    public Onibus(String marca, String modelo, int ano, String cor, double preco, int nPassageiros, String tipoOnibus) {
        
        super(marca, modelo, ano, cor, preco);
        this.nPassageiros = nPassageiros;
        this.tipoOnibus = tipoOnibus;
        
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public String getTipoOnibus() {
        return tipoOnibus;
    }

    public void setTipoOnibus(String tipoOnibus) {
        this.tipoOnibus = tipoOnibus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Ônibus: " + getModelo() + " - Ano: " + getAno());
        System.out.println("Marca: " + getMarca() + " - Cor: " + getCor());
        System.out.println("Número de Passageiros: " + nPassageiros);
        System.out.println("Tipo de Ônibus: " + tipoOnibus);
        System.out.println("Preço: R$" + getPreco());
    }
    
}
