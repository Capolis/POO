public class Ave extends Animal {

    private boolean voa;
    private String som;

    protected Ave(String nome, int idade, boolean voa) {
        super(nome, idade);
        setVoa(voa);

    }

    protected Ave(String nome, String som) {
        this(nome, 0, true); // Chama o construtor com idade padrão 0 e voa como true
        setSom(som);
    }

    @Override
    protected void emitirSom() {
        System.out.println(getNome() + " está cantando.");
    }

    @Override
    protected void emitirSom(String som) {
        System.out.println(getNome() + " está emitindo o som: " + som);
    }

    protected void botarOvo() {
        System.out.println(getNome() + " botou um ovo.");
    }

    protected boolean isVoa() {
        return voa;
    }

    protected void setVoa(boolean voa) {
        this.voa = voa;
    }

    protected String getSom() {
        return som;
    }

    protected void setSom(String som) {
        this.som = som;
    }
}