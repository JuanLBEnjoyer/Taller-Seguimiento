package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Cliente extends Persona {
    private final String numeroCliente;
    private final Collection<PrestamoRegistro> registroPrestamo;
    

    public Cliente(String nombre, String apellido, Byte edad, String numeroCliente,
            Collection<Prestamo> registroPrestamo) {
        super(nombre, apellido, edad);
        assert numeroCliente != null && !numeroCliente.isBlank();
        this.numeroCliente = numeroCliente;
        this.registroPrestamo = new LinkedList<>();
    }
    
    public Collection<PrestamoRegistro> getRegistroPrestamo(){
        return registroPrestamo;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    @Override
    public Byte gedEdad() {
        return edad;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public String getNombre() {
        return getNombre();
    }
    
    @Override
    public void setNombre(String nombre) {
        assert nombre != null && nombre.isBlank();
        this.nombre=nombre;
    }

    @Override
    public void setApellido(String apellido) {
        assert apellido != null && apellido.isBlank();
        this.apellido=apellido; 
    }

    @Override
    public void setEdad(Byte edad) {
        assert edad>=0;
        this.edad=edad;   
    }





}