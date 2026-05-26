package model;

import javafx.scene.image.Image;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ParqueAtracciones {

    private String nombre;
    private String uId;

    private ArrayList<Persona> personal = new ArrayList<>();
    private ArrayList<Reporte> reportes = new ArrayList<>();
    private ArrayList<Zona> zonas = new ArrayList<>();
    private ArrayList<Atraccion> atracciones = new ArrayList<>();

}

// -------------------- CRUD OPERADOR --------------------

public void crearOperador() {

    String correo = JOptionPane.showInputDialog("Ingrese correo");
    String contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
    float salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese salario"));

    Atraccion atraccion = null;

    Operador nuevo = new Operador(
            correo, contraseña, nombre, identificacion, edad,
            salario, atraccion
    );

    personal.add(nuevo);

    JOptionPane.showMessageDialog(null, "Operador registrado correctamente");
}

public void actualizarOperador() {

    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");

    for (Persona p : personal) {

        if (p instanceof Operador) {

            Operador o = (Operador) p;

            if (o.getIdentificacion().equalsIgnoreCase(identificacion)) {

                float nuevoSalario = Float.parseFloat(
                        JOptionPane.showInputDialog("Ingrese nuevo salario")
                );

                o.setSalario(nuevoSalario);

                JOptionPane.showMessageDialog(null, "Operador actualizado");
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Operador no encontrado");
}

public void eliminarOperador() {

    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");

    for (int i = 0; i < personal.size(); i++) {

        if (personal.get(i) instanceof Operador) {

            Operador o = (Operador) personal.get(i);

            if (o.getIdentificacion().equalsIgnoreCase(identificacion)) {

                personal.remove(i);

                JOptionPane.showMessageDialog(null, "Operador eliminado");
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Operador no encontrado");
}

// -------------------- CRUD VISITANTE --------------------

public void crearVisitante() {

    String correo = JOptionPane.showInputDialog("Ingrese correo");
    String contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
    float saldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese saldo"));

    Entrada tipoEntrada = null;
    Image avatar = null;

    Visitante nuevo = new Visitante(
            correo, contraseña, nombre, identificacion, edad,
            saldo, tipoEntrada, avatar
    );

    personal.add(nuevo);

    JOptionPane.showMessageDialog(null, "Visitante registrado correctamente");
}

public void actualizarVisitante() {

    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");

    for (Persona p : personal) {

        if (p instanceof Visitante) {

            Visitante v = (Visitante) p;

            if (v.getIdentificacion().equalsIgnoreCase(identificacion)) {

                float nuevoSaldo = Float.parseFloat(
                        JOptionPane.showInputDialog("Ingrese nuevo saldo")
                );

                v.setSaldoVirtual(nuevoSaldo);

                JOptionPane.showMessageDialog(null, "Visitante actualizado");
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Visitante no encontrado");
}

public void eliminarVisitante() {

    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");

    for (int i = 0; i < personal.size(); i++) {

        if (personal.get(i) instanceof Visitante) {

            Visitante v = (Visitante) personal.get(i);

            if (v.getIdentificacion().equalsIgnoreCase(identificacion)) {

                personal.remove(i);

                JOptionPane.showMessageDialog(null, "Visitante eliminado");
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Visitante no encontrado");
}

// -------------------- CRUD ZONA --------------------

public void crearZona() {

    String nombre = JOptionPane.showInputDialog("Ingrese nombre de la zona");

    Zona nueva = new Zona(nombre);

    zonas.add(nueva);

    JOptionPane.showMessageDialog(null, "Zona registrada correctamente");
}

public void actualizarZona() {

    String nombreZona = JOptionPane.showInputDialog("Ingrese nombre de la zona");

    for (Zona z : zonas) {

        if (z.getNombre().trim().equalsIgnoreCase(nombreZona.trim())) {

            String nuevaZona = JOptionPane.showInputDialog("Ingrese el nuevo nombre");

            z.setNombre(nuevaZona);

            JOptionPane.showMessageDialog(null, "Zona actualizada");
            return;
        }
    }

    JOptionPane.showMessageDialog(null, "Zona no encontrada");
}

public void eliminarZona() {

    String nombreZona = JOptionPane.showInputDialog("Ingrese nombre de la zona");

    for (int i = 0; i < zonas.size(); i++) {

        if (zonas.get(i).getNombre().trim().equalsIgnoreCase(nombreZona.trim())) {

            zonas.remove(i);

            JOptionPane.showMessageDialog(null, "Zona eliminada");
            return;
        }
    }

    JOptionPane.showMessageDialog(null, "Zona no encontrada");
}

// ----------------------CRUD ADMINISTRADOR-----------------------------

public void crearAdministrador() {

    String correo = JOptionPane.showInputDialog("Ingrese correo");
    String contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));

    Administrador nuevo = new Administrador(
            correo, contraseña, nombre, identificacion, edad, this
    );

    personal.add(nuevo);

    JOptionPane.showMessageDialog(null, "Administrador registrado correctamente");
}

public void actualizarAdministrador() {

    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");

    for (Persona p : personal) {

        if (p instanceof Administrador) {

            Administrador a = (Administrador) p;

            if (a.getIdentificacion().equalsIgnoreCase(identificacion)) {

                String nuevoNombre = JOptionPane.showInputDialog("Ingrese nuevo nombre");

                a.setNombre(nuevoNombre);

                JOptionPane.showMessageDialog(null, "Administrador actualizado");
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Administrador no encontrado");
}

public void eliminarAdministrador() {

    String identificacion = JOptionPane.showInputDialog("Ingrese identificación");

    for (int i = 0; i < personal.size(); i++) {

        if (personal.get(i) instanceof Administrador) {

            Administrador a = (Administrador) personal.get(i);

            if (a.getIdentificacion().equalsIgnoreCase(identificacion)) {

                personal.remove(i);

                JOptionPane.showMessageDialog(null, "Administrador eliminado");
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Administrador no encontrado");
}

public ArrayList<Atraccion> obtenerAtracciones(){
    return atracciones;
}
public Atraccion buscarAtraccion(int identificador){
    for(Atraccion a : atracciones){
        if(a.getIdentificador() == identificador){
            return a;
        }
    }
    return null;
}
public boolean actualizarAtraccion(int identificador, Atraccion nuevaAtraccion){
    for(int i = 0; i < atracciones.size(); i++){
        if(atracciones.get(i).getIdentificador() == identificador){
            atracciones.set(i, nuevaAtraccion);
            return true;
        }
    }
    return false;
}
public boolean eliminarAtraccion(int identificador){
    Atraccion atraccion = buscarAtraccion(identificador);

    if(atraccion != null){
        atracciones.remove(atraccion);
        return true;
    }

    return false;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getuId() {
    return uId;
}
public void setuId(String uId) {
    this.uId = uId;
}
public boolean agregarOperador(Operador operador) {
    return operadores.add(operador);
}

public ArrayList<Operador> obtenerOperadores() {
    return operadores;
}

public Operador buscarOperador(String identificacion) {

    for (Operador operador : operadores) {

        if (operador.getIdentificacion().equals(identificacion)) {
            return operador;
        }
    }

    return null;
}

public boolean actualizarOperador(String identificacion, Operador nuevoOperador) {

    for (int i = 0; i < operadores.size(); i++) {

        if (operadores.get(i).getIdentificacion().equals(identificacion)) {

            operadores.set(i, nuevoOperador);
            return true;
        }
    }

    return false;
}

public boolean eliminarOperador(String identificacion) {

    Operador operador = buscarOperador(identificacion);

    if (operador != null) {
        operadores.remove(operador);
        return true;
    }
    return false;
}
public boolean agregarVisitante(Visitante visitante) {
    return visitantes.add(visitante);
}

public ArrayList<Visitante> obtenerVisitantes() {
    return visitantes;
}

public Visitante buscarVisitante(String identificacion) {

    for (Visitante visitante : visitantes) {

        if (visitante.getIdentificacion().equals(identificacion)) {
            return visitante;
        }
    }

    return null;
}

public boolean actualizarVisitante(String identificacion, Visitante nuevoVisitante) {

    for (int i = 0; i < visitantes.size(); i++) {

        if (visitantes.get(i).getIdentificacion().equals(identificacion)) {

            visitantes.set(i, nuevoVisitante);
            return true;
        }
    }

    return false;
}

public boolean eliminarVisitante(String identificacion) {

    Visitante visitante = buscarVisitante(identificacion);

    if (visitante != null) {
        visitantes.remove(visitante);
        return true;
    }

    return false;
}
public boolean agregarAdministrador(Administrador administrador) {
    return administradores.add(administrador);
}

public ArrayList<Administrador> obtenerAdministradores() {
    return administradores;
}

public Administrador buscarAdministrador(String identificacion) {

    for (Administrador administrador : administradores) {

        if (administrador.getIdentificacion().equals(identificacion)) {
            return administrador;
        }
    }

    return null;
}

public boolean actualizarAdministrador(String identificacion, Administrador nuevoAdministrador) {

    for (int i = 0; i < administradores.size(); i++) {

        if (administradores.get(i).getIdentificacion().equals(identificacion)) {

            administradores.set(i, nuevoAdministrador);
            return true;
        }
    }

    return false;
}

public boolean eliminarAdministrador(String identificacion) {

    Administrador administrador = buscarAdministrador(identificacion);

    if (administrador != null) {
        administradores.remove(administrador);
        return true;
    }

    return false;
}
    }