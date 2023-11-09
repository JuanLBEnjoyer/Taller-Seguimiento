package co.edu.uniquindio.poo;

public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private final byte edad;

    public Persona(String nombre, String apellido, Byte edad){
        assert nombre != null && nombre.isBlank();
        assert apellido != null && apellido.isBlank();
        assert edad >= 15;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;

    }

    public String getNombreCompleto(){
        return nombre + " "+apellido;
    }

    public byte getEdad() {
        return edad;
    }
    
}
