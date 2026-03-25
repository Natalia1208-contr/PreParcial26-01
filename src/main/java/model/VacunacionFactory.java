package model;

public class VacunacionFactory extends ServicioFactory {
    @Override
    public Servicio crearServicio(String codigo, String nombre, double costoBase, double duracion) {
        return new Vacunacion(codigo,nombre,costoBase,duracion);
    }
}
