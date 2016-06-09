/*
    Pérez Lira Jorge Alberto
    Ingenieria en Sistemas Computacionales
    Programacion Orientada a Objetos
    MS2     15470147
 */
package demoherencia;

/**
 *
 * @author Jorge Perez
 */
public class cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String email;
    
    public cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public cliente(){
        
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getdireccion(){
        return direccion;
    }
    public String getocupacion(){
        return ocupacion;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getemail(){
        return email;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
    public void setfechaDeNacimiento(String fechaDeNacimiento ){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setocupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public void setemail(String email){
        this.email = email;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Datos del Cliente{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de Nacimiento: " + fechaDeNacimiento + 
                ", Direccion: " + direccion + ", Ocupacion: " + ocupacion + ", Telefono: " + telefono + ", Email: " + email + '}';
    }
}

