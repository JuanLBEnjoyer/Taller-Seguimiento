package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import scorex.util.ArrayList;

public class Biblioteca implements Prestamo{
    public Collection<Libro> libros;
    public Collection<PrestamoRegistro> prestamoLibros;
    public Collection<Cliente> clientes;
    public Biblioteca(Collection<Libro> libros, Collection<PrestamoRegistro> prestamoLibros, Collection<Cliente> clientes) {
        this.libros = new LinkedList<>();
        this.prestamoLibros = new LinkedList<>();
        this.clientes = new LinkedList<>();
    }

    
    public Collection<Libro> getLibros() {
        return libros;
    }

    public Collection<PrestamoRegistro> getPrestamoLibros() {
        return prestamoLibros;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void registrarLibro(Libro libro){
        libros.add(libro);
    }

    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Optional<Libro> buscarLibroAutorTitulo(String autor, String titulo){
        Predicate<Libro> condicion1 = libro -> libro.getAutor().equals(autor);
        Predicate<Libro> condicion2 = libro -> libro.getTitulo().equals(titulo);
        Predicate<Libro> condicionFinal = condicion1.or(condicion2);
        return libros.stream().filter(condicionFinal).findAny();
    }
   
    @Override
    public void prestamoLibro(Cliente cliente, Libro libro, LocalDate fechaPrestamo){
        assert libros.contains(libro);
        assert libro.getNumeroEjemplares()>0;
        PrestamoRegistro registro = new PrestamoRegistro(libro, cliente, fechaPrestamo, null);
        cliente.getRegistroPrestamo().add(registro);
        prestamoLibros.add(registro);
        libro.setNumeroEjemplares(libro.getNumeroEjemplares()-1);
    }

    @Override
    public void devolucionLibro(Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion){
        Optional<PrestamoRegistro> registro = buscarPrestamo(libro, fechaPrestamo);
        if (registro != null){  
            registro.get().setFechaDevolucion(fechaDevolucion);
            libro.setNumeroEjemplares(libro.getNumeroEjemplares()+1);}
    }

    public Optional<PrestamoRegistro> buscarPrestamo(Libro libro, LocalDate fechaPrestamo){
        Predicate<PrestamoRegistro> condicion = prestamo -> prestamo.getLibro().equals(libro) 
        && prestamo.getFechaPrestamo().equals(fechaPrestamo);
        return prestamoLibros.stream().filter(condicion).findAny();
    }

    public Optional<PrestamoRegistro> buscarPrestamoLibro(Libro libro){
        Predicate<PrestamoRegistro> condicion = prestamo -> prestamo.getLibro().equals(libro);
        return prestamoLibros.stream().filter(condicion).findAny();
    }    


    public Collection<PrestamoRegistro> informePrestamo(Libro libro){
        List<PrestamoRegistro> prestamo = new ArrayList<PrestamoRegistro>();
        Optional<PrestamoRegistro> informeOptional = buscarPrestamoLibro(libro);
        prestamo.add(informeOptional.get());
        return prestamo;
    }
}

