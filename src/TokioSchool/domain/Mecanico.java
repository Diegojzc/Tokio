package TokioSchool.domain;

public class Mecanico {
    private String nombre;
    private String apellidos;
    private String correo;
    private String especialidad;
    private int numero_reparaciones;

    public Mecanico(String nombre, String apellidos, String correo, String especialidad, int numero_reparaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.especialidad = especialidad;
        this.numero_reparaciones = numero_reparaciones;
    }

    public Mecanico(String nombre, String apellidos, String correo, String especialidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumero_reparaciones() {
        return numero_reparaciones;
    }

    public void setNumero_reparaciones(int numero_reparaciones) {
        this.numero_reparaciones = numero_reparaciones;
    }
}
