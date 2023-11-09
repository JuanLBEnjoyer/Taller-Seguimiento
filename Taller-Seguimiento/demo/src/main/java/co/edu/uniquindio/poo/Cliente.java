package co.edu.uniquindio.poo;

public class Cliente extends Persona {
    private final String numeroCliente;
    

    public Cliente(String nombre, String apellido, Byte edad, String numeroCliente) {
        super(nombre, apellido, edad);
        assert numeroCliente != null && numeroCliente.isBlank();
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    
    
}
