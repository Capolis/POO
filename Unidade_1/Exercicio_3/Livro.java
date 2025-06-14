public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    protected Livro(String titulo, String autor, int numeroPaginas) {
        setTitulo(titulo);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);
    }

    protected void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    // Getters e Setters
    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    protected int getNumeroPaginas() {
        return numeroPaginas;
    }

    protected void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas <= 0) {
            numeroPaginas = 1;
            System.out.println("Número de páginas inválido. Definindo como 1.");
        }
        else {
            this.numeroPaginas = numeroPaginas;
        }
    }
}