public class Peixe extends Animal {

    private boolean aguaDoce;
    private String som;

    protected Peixe(String nome, int idade, boolean aguaDoce) {
        super(nome, idade);
        setAguaDoce(aguaDoce);        
    }

    protected Peixe(String nome, String som) {
        this(nome, 0, true); // Chama o construtor com idade padrão 0 e aguaDoce como true
        setSom(som);
    }

    @Override
    protected void emitirSom() {
        System.out.println(getNome() + " está fazendo bolhas na água.");
    }

    @Override
    protected void emitirSom(String som) {
        System.out.println(getNome() + " está emitindo o som: " + som);
    }

    protected void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    protected boolean isAguaDoce() {
        return aguaDoce;
    }

    protected void setAguaDoce(boolean aguaDoce) {
        this.aguaDoce = aguaDoce;
    }

    protected String getSom() {
        return som;
    }

    protected void setSom(String som) {
        this.som = som;
    }
}