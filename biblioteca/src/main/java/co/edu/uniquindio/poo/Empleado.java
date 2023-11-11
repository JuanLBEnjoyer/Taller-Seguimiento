package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private final Cargo cargo;

    public Empleado(String nombre, String apellido, Byte edad, Cargo cargo){
        super(nombre, apellido, edad);
        assert cargo != null;
        this.cargo=cargo;
    }
    
    public Cargo getCargo(){
        return cargo;
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
