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
}
