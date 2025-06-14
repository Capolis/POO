public class Triangulo {
    
    private double base;
    private double altura;

    protected Triangulo(double base, double altura) {

        setBase(base);
        setAltura(altura);

    }

    protected double calcularArea() {
        return (base * altura) / 2;
    }

    // Getters e Setters
    protected double getBase() {
        return base;
    }

    protected void setBase(double base) {
        if(base <= 0){
            base = 1;
            System.out.println("Base inválida, usando valor padrão de 1.");
        }
        else{
            this.base = base;
        }
    }

    protected double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        if(altura <= 0){
            altura = 1;
            System.out.println("Altura inválida, usando valor padrão de 1.");
        }else{
            this.altura = altura;
        }
    }
}