package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class PrestamoRegistro {
    private Libro libro;
    private Cliente cliente;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    public PrestamoRegistro(Libro libro, Cliente cliente, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        assert libro != null:"Debe añadir el libro que se presto";
        assert cliente != null:"Debe añadir el cliente al que se le realizo el prestamo";
        assert fechaPrestamo.isBefore(LocalDate.now().plusDays(1));
        this.libro = libro;
        assert fechaDevolucion.isBefore(LocalDate.now().plusDays(1));
        assert fechaDevolucion.isAfter(fechaDevolucion);
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public Libro getLibro() {
        return libro;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
}
