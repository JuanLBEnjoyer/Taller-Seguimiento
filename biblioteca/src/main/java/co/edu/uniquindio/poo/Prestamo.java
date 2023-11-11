package co.edu.uniquindio.poo;

import java.time.LocalDate;

public interface Prestamo {
    void prestamoLibro(Cliente cliente, Libro libro, LocalDate fechaPrestamo);
    void devolucionLibro(Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion);
}
