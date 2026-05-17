package model;

public class Operador extends Persona implements IControlarAtracciones{
    private float salario;
    private Atraccion theAtraccion;
    public Operador(String correo, String contraseña, String nombre, String identificacion, int edad, float salario, Atraccion theAtraccion) {
        super(correo, contraseña, nombre, identificacion, edad);
        this.salario = salario;
        this.theAtraccion = theAtraccion;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Atraccion getTheAtraccion() {
        return theAtraccion;
    }

    public void setTheAtraccion(Atraccion theAtraccion) {
        this.theAtraccion = theAtraccion;
    }

    @Override
    public Boolean modificarAtracciones(Atraccion atraccionModificada){
        this.theAtraccion = atraccionModificada;
        return true;
    }

}
