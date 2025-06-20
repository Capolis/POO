public class Mamifero extends Animal {

    private boolean temPelos;
    private String som;

    protected Mamifero(String nome, int idade, boolean temPelos) {
        super(nome, idade);
        setTemPelos(temPelos);        
    }

    protected Mamifero(String nome, String som) {
        this(nome, 0, true); // Chama o construtor com idade padrão 0 e temPelos como true
        setSom(som);
    }

    @Override
    protected void emitirSom() {
        System.out.println(getNome() + " está fazendo um som característico de mamífero.");
    }

    @Override
    protected void emitirSom(String som) {
        System.out.println(getNome() + " está emitindo o som: " + som);
    }

    protected void amamentar() {
        System.out.println(getNome() + " está amamentando.");
    }

    protected boolean isTemPelos() {
        return temPelos;
    }

    protected void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    protected String getSom() {
        return som;
    }

    protected void setSom(String som) {
        this.som = som;
    }
}
