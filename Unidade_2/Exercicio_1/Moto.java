public class Moto extends Veiculo {

    private int cilindradas;
    private boolean partidaEletrica;

    protected Moto(String modelo, int ano, int cilindradas, boolean partidaEletrica) {

        super(modelo, ano);
        setCilindradas(cilindradas);
        setPartidaEletrica(partidaEletrica);

    }

    @Override
    protected void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Moto - Cilindradas: " + cilindradas + ", Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
        empinar();
    }

    protected void empinar() {
        System.out.println("A moto está empinando!");
    }

    
    protected boolean isPartidaEletrica() {
        return partidaEletrica;
    }
    
    // Setters e Getters
    protected void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    protected int getCilindradas() {
        return cilindradas;
    }
    
    protected void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}