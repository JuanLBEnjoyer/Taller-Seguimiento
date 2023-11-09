package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class PrestamoRegistro {
    private Libro libro;
    private Cliente cliente;
    private LocalDate fechaPrestamo;
    public PrestamoRegistro(Libro libro, Cliente cliente, LocalDate fechaPrestamo) {
        assert libro != null:"Debe añadir el libro que se presto";
        assert cliente != null:"Debe añadir el cliente al que se le realizo el prestamo";
        assert fechaPrestamo.isBefore(LocalDate.now().plusDays(1));
        this.libro = libro;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
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
    
}
