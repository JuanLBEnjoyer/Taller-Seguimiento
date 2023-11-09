package co.edu.uniquindio.poo;

public class Autor {
    private final String id;
    private final String nombre;
    private final String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad){
        assert id != null && id.isBlank(): "Debe poner la identificacion del autor";
        assert nombre != null && nombre.isBlank():"Debe poner el nombre del autor";
        assert nacionalidad !=null && nacionalidad.isBlank():"Debe poner la nacionalidad del autor";
        this.id=id;
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    
    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }
    

    
}
