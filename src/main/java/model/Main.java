package model;

public class Main {
    public static void main(String[] args) {
        ConfigVet c1=ConfigVet.obtener("vet patitas",60,20000);
        ServicioFactory fabrica;
        fabrica=new EmergenciaFactory();
        fabrica.crearServicio("123","emergencia perrito", 20000,30);
        fabrica=new VacunacionFactory();
        fabrica.crearServicio("5333","vacuna rabia",15000,10);
        Cita vacunacion=new Cita.Builder().
                conServicio(fabrica.crearServicio("124","vacuna rabia",15000,10)).
                conCodigo("12").
                conDistancia(15).
                conNombreMacota("niño").
                build();
        System.out.println(c1.calcularCostoTotal(vacunacion));
        Cita clonCita=(Cita)vacunacion.clonar();
        clonCita.setCodigo("34");
        System.out.println(vacunacion.getCodigo());
        System.out.println(clonCita.getCodigo());
    }
}
