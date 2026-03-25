package model;

public class ConsultaFactory extends ServicioFactory{
    @Override
    public Servicio crearServicio(String codigo, String nombre, double costoBase, double duracion) {
        return new Consulta(codigo,nombre,costoBase,duracion);
    }
}
