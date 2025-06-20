public class Carro extends Veiculo {

    private int portas;
    private boolean arCondicionado;

    protected Carro(String modelo, int ano, int portas, boolean arCondicionado) {

        super(modelo, ano);
        setPortas(portas);
        setArCondicionado(arCondicionado);

    }

    @Override
    protected void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Carro - Portas: " + portas + ", Ar-condicionado: " + (arCondicionado ? "Sim" : "Não"));
        ligarSom();
    }

    protected void ligarSom() {
        System.out.println("Som do carro ligado.");
    }

    
    protected boolean isArCondicionado() {
        return arCondicionado;
    }
    
    protected void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    // Getters e Setters
    protected int getPortas() {
        return portas;
    }
    
    protected void setPortas(int portas) {
        this.portas = portas;
    }
}
