package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
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

    @Override
    public void prestamoLibro(){

    }

    @Override
    public void devolucionLibro(){

    }


}

