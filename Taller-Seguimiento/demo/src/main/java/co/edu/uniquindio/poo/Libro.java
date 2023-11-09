package co.edu.uniquindio.poo;

public class Libro {
    private final String titulo;
    private  Autor autor;
    private final byte numeroEjemplares;
    public Libro(String titulo, Autor autor, byte numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public byte getNumeroEjemplares() {
        return numeroEjemplares;
    }

}

