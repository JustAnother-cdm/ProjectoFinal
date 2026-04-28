package model;

public abstract class Persona {
    protected String correo;
    protected String contraseña;
    protected String nombre;
    protected String identificacion;
    protected int edad;

    public Persona(String correo, String contraseña, String nombre, String identificacion, int edad) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean comprobarSecion (String correo, String contraseña)
    {
        boolean band = false;
        if (correo.equals(this.correo) && contraseña.equals(this.contraseña)) band = true;
        return band;
    }

}
