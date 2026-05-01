package model;
import javafx.scene.image.Image;

public class Visitante extends Persona {
    private float saldoVirtual;
    private Entrada tipoEntrada;
    private Image avatar;

    public Visitante(String correo, String contraseña, String nombre, String identificacion, int edad, float saldoVirtual, Entrada tipoEntrada, Image avatar) {
        super(correo, contraseña, nombre, identificacion, edad);
        this.saldoVirtual = saldoVirtual;
        this.tipoEntrada = tipoEntrada;
        this.avatar = avatar;
    }

    public float getSaldoVirtual() {
        return saldoVirtual;
    }

    public void setSaldoVirtual(float saldoVirtual) {
        this.saldoVirtual = saldoVirtual;
    }

    public Entrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(Entrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }
}
