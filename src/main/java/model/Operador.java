package model;

public class Operador extends Persona{
    private float salario;
    public Operador(String correo, String contraseña, String nombre, String identificacion, int edad, float salario) {
        super(correo, contraseña, nombre, identificacion, edad);
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
