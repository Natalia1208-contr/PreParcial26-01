package model;

public class Consulta extends Servicio{

    public Consulta(String codigo, String nombre, double costoBase, double duracionMin) {
        super(codigo, nombre, costoBase, duracionMin);
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }
}
