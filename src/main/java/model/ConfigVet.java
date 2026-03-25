package model;

public class ConfigVet implements FuncionalidadesSistema{
    private static ConfigVet instancia;
    private String nombre;
    private double velocidad;
    private double tarifa;

    private ConfigVet(String nombre,double velocidad, double tarifa ) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tarifa = tarifa;
    }
    public static ConfigVet obtener(String nombre, double velocidad, double tarifa) {
        if(instancia==null){
            instancia= new ConfigVet(nombre,velocidad,tarifa);
        }
        return instancia;
    }

    @Override
    public double calcularCostoTotal(Cita cita) {
        double costoServicio=cita.getServicio().calcularCosto();
        double costoDesplazamiento=tarifa*cita.getDistanciaKm();
        return costoServicio+costoDesplazamiento;
    }

    @Override
    public double calcularTiempoEstimado(Cita cita) {
       return cita.getDistanciaKm()/velocidad;
    }
}
