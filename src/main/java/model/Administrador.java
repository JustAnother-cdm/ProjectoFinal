package model;

public class Administrador extends Persona implements IControlarAtracciones{
    private ParqueAtracciones theParqueAtracciones;

    public Administrador(String correo, String contraseña, String nombre, String identificacion, int edad, ParqueAtracciones theParqueAtracciones) {
        super(correo, contraseña, nombre, identificacion, edad);
        this.theParqueAtracciones = theParqueAtracciones;
    }

}
