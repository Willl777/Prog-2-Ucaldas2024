package Punto2;

public class Libro {
    private String titulo;
    private Autor autor;
    private String isbn;
    private String categoria;
    private int ejemplares;

    public Libro(String titulo, Autor autor, String isbn, String categoria, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.categoria = categoria;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void prestar() {
        ejemplares--;
    }

    public void devolver() {
        ejemplares++;
    }

    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", isbn='" + isbn + '\'' +
                ", categoria='" + categoria + '\'' +
                ", ejemplares=" + ejemplares +
                '}';
    }
}
