package co.edu.uniquindio.poo;

public class Libro {
    private final String titulo;
    private  String autor;
    private int numeroEjemplares;
    public Libro(String titulo, String autor, int numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    public void setNumeroEjemplares(int numeroEjemplares1) {
        this.numeroEjemplares = numeroEjemplares1;
    }
    

}