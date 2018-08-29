package edatos;

public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String celular;

    public Persona(){}
    public Persona(String cedula, String nombres, String apellidos, String correo, String celular) {
        this.cedula = cedula;
        this.nombres=nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", celular=" + celular + '}';
    }
    
    public String getNombreCompleto(){
      return this.nombres+" "+this.apellidos;
    }
}
