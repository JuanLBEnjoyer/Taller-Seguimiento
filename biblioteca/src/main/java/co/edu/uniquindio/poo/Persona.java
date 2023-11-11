package co.edu.uniquindio.poo;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected byte edad;

    public Persona(String nombre, String apellido, Byte edad){
        assert nombre != null && nombre.isBlank();
        assert apellido != null && apellido.isBlank();
        assert edad >= 15;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;

    }

    public abstract String getNombre();
    public abstract String getApellido();
    public abstract Byte gedEdad();    
    public abstract void setNombre(String nombre);
    public abstract void setApellido(String apellido);
    public abstract void setEdad(Byte edad);

}