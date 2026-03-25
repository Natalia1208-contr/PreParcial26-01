package model;

public abstract class Servicio {
    protected String codigo;
    protected String nombre;
    protected double costoBase;
    protected double duracionMin;

    public Servicio(String codigo, String nombre, double costoBase, double duracionMin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoBase = costoBase;
        this.duracionMin = duracionMin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) {
        this.duracionMin = duracionMin;
    }

    public abstract double calcularCosto();
}
