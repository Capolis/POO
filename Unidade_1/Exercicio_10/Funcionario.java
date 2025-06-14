public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    protected Funcionario(String nome, String cargo, double salario) {

        setNome(nome);
        setCargo(cargo);
        setSalario(salario);

    }

    protected double calcularAumento(double percentual) {
        return salario + (salario * percentual / 100.0);
    }

    // Getters e Setters
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCargo() {
        return cargo;
    }

    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        if(salario <= 0){
            System.out.println("CLT é foda mesmo...");
        }
        this.salario = salario;
    }
}