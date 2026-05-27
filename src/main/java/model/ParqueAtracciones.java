package model;

import javafx.scene.image.Image;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ParqueAtracciones {

    private String nombre;
    private String uId;

    public ParqueAtracciones(String nombre, String uId) {
        this.nombre = nombre;
        this.uId = uId;

    }

    private ArrayList<Persona> personal = new ArrayList<>();
    private ArrayList<Reporte> reportes = new ArrayList<>();
    private ArrayList<Zona> zonas = new ArrayList<>();
    private ArrayList<Atraccion> atracciones = new ArrayList<>();



// -------------------- CRUD OPERADOR --------------------

    public boolean crearOperador(String correo, String contraseña, String nombre,
                                 String identificacion, int edad, float salario) {

        for (int i = 0; i < personal.size(); i++) {
            Persona p = personal.get(i);
            if (p.getIdentificacion().equals(identificacion) || p.getCorreo().equals(correo)) {
                return false;
            }
        }

        Atraccion atraccion = null; // Asigna según tu lógica si corresponde

        Operador nuevo = new Operador(
                correo, contraseña, nombre, identificacion, edad, salario, atraccion
        );

        personal.add(nuevo);
        return true;
    }
    public boolean actualizarOperador(String correo, String contraseña, String nombre,
                                      String identificacion, int edad, float salario,
                                      Atraccion theAtraccion) {

        for (int i = 0; i < personal.size(); i++) {
            Persona p = personal.get(i);

            if (p instanceof Operador) {
                Operador op = (Operador) p;

                if (op.getIdentificacion().equals(identificacion) || op.getCorreo().equals(correo)) {

                    for (int j = 0; j < personal.size(); j++) {
                        if (j == i) continue;
                        Persona otro = personal.get(j);
                        if (otro.getIdentificacion().equals(identificacion) || otro.getCorreo().equals(correo)) {
                            return false; // colisión de identificacion/correo con otro usuario
                        }
                    }

                    op.setCorreo(correo);
                    op.setContraseña(contraseña);
                    op.setNombre(nombre);
                    op.setEdad(edad);
                    op.setSalario(salario);
                    op.setTheAtraccion(theAtraccion);

                    return true;
                }
            }
        }

        return false; // no se encontró el operador
    }

public boolean eliminarUsuario(String identificacion) {
    boolean band = false;
    for (int i = 0; i < personal.size(); i++) {

        if (personal.get(i).equals(identificacion)) {
            personal.remove(i);
            return band = true;
        }
    }
    return band;
}


// -------------------- CRUD VISITANTE --------------------

    public boolean crearVisitante(String correo, String contraseña, String nombre,
            String identificacion, int edad, float saldoVirtual,
    Image avatar) {

        // Validar que no exista alguien con misma identificación o correo
        for (int i = 0; i < personal.size(); i++) {
            Persona p = personal.get(i);
            if (p.getIdentificacion().equals(identificacion) || p.getCorreo().equals(correo)) {
                return false;
            }
        }

        Entrada tipoEntrada = null; // ajusta un valor por defecto si aplica

        Visitante nuevo = new Visitante(
                correo, contraseña, nombre, identificacion, edad,
                saldoVirtual, tipoEntrada, avatar
        );

        personal.add(nuevo);
        return true;
    }

    public boolean actualizarVisitante(String correo, String contraseña, String nombre,
                                       String identificacion, Entrada tipoEntrada,
                                       int edad, float saldoVirtual, Image avatar) {

        for (int i = 0; i < personal.size(); i++) {
            Persona p = personal.get(i);

            if (p instanceof Visitante) {
                Visitante v = (Visitante) p;

                // Localiza al visitante por identificación o por correo
                if (v.getIdentificacion().equals(identificacion) || v.getCorreo().equals(correo)) {

                    v.setNombre(nombre);
                    v.setEdad(edad);
                    v.setSaldoVirtual(saldoVirtual);
                    v.setTipoEntrada(tipoEntrada);

                    return true;
                }
            }
        }

        return false; // no se encontró el visitante
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
public boolean crearAdministrador(String correo, String contraseña, String nombre,
                                  String identificacion, int edad,
                                  ParqueAtracciones theParqueAtracciones) {

    for (int i = 0; i < personal.size(); i++) {
        Persona p = personal.get(i);
        if (p.getIdentificacion().equals(identificacion) ||
                p.getCorreo().equalsIgnoreCase(correo)) {
            return false;
        }
    }

    Administrador nuevo = new Administrador(
            correo, contraseña, nombre, identificacion, edad, theParqueAtracciones
    );

    personal.add(nuevo);
    return true;
}


    public boolean actualizarAdministrador(String correo, String contraseña, String nombre,
                                           String identificacion, int edad,
                                           ParqueAtracciones theParqueAtracciones) {

        for (int i = 0; i < personal.size(); i++) {
            Persona p = personal.get(i);

            if (p instanceof Administrador) {
                Administrador a = (Administrador) p;

                if (a.getIdentificacion().equals(identificacion) || a.getCorreo().equals(correo)) {


                    a.setContraseña(contraseña); // ajusta al nombre real del setter
                    a.setNombre(nombre);
                    a.setEdad(edad);

                    return true;
                }
            }
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

}


