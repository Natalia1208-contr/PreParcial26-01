package model;

public class Vacunacion extends Servicio{
    public Vacunacion(String codigo, String nombre, double costoBase, double duracionMin) {
        super(codigo, nombre, costoBase, duracionMin);
    }

    @Override
    public double calcularCosto() {
        return costoBase*0.9;
    }
}
