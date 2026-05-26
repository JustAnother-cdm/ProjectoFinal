package model;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private ArrayList<Atraccion> listaAtracciones;

    public Zona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }

}