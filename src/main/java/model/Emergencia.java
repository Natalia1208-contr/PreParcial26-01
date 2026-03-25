package model;

public class Emergencia extends Servicio{
    public Emergencia(String codigo, String nombre, double costoBase, double duracionMin) {
        super(codigo, nombre, costoBase, duracionMin);
    }

    @Override
    public double calcularCosto() {
        return costoBase*1.5;
    }
}
