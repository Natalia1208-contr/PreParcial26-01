package model;

public class EmergenciaFactory extends ServicioFactory{
    @Override
    public Servicio crearServicio(String codigo, String nombre, double costoBase, double duracion) {
        return new Emergencia(codigo,nombre,costoBase,duracion);
    }
}
