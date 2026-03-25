package model;

public abstract class ServicioFactory {
    public abstract Servicio crearServicio(String codigo, String nombre, double costoBase, double duracion);
}
