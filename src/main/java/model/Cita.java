package model;

public class Cita implements Prototipo{
    private String codigo;
    private String fecha;
    private String nombreCliente;
    private String direccion;
    private double distanciaKm;
    private String nombreMascota;
    private String especieMascota;
    private Servicio servicio;
    private String observacionesPrevias;
    private String telefono;

    private Cita(Builder b){
        this.codigo=b.codigo;
        this.fecha=b.fecha;
        this.nombreCliente=b.nombreCliente;
        this.direccion=b.direccion;
        this.distanciaKm=b.distanciaKm;
        this.nombreMascota=b.nombreMascota;
        this.especieMascota=b.especieMascota;
        this.servicio=b.servicio;
        this.observacionesPrevias=b.observacionesPrevias;
        this.telefono=b.telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecieMascota() {
        return especieMascota;
    }

    public void setEspecieMascota(String especieMascota) {
        this.especieMascota = especieMascota;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getObservacionesPrevias() {
        return observacionesPrevias;
    }

    public void setObservacionesPrevias(String observacionesPrevias) {
        this.observacionesPrevias = observacionesPrevias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cita (Cita prot){
        this.codigo=prot.codigo;
        this.fecha=prot.fecha;
        this.nombreCliente=prot.nombreCliente;
        this.direccion=prot.direccion;
        this.distanciaKm=prot.distanciaKm;
        this.nombreMascota=prot.nombreMascota;
        this.especieMascota=prot.especieMascota;
        this.servicio=prot.servicio;
        this.observacionesPrevias=prot.observacionesPrevias;
        this.telefono=prot.telefono;
    }
    @Override
    public Prototipo clonar() {
        return new Cita(this);
    }


    public static class Builder{
        private String codigo;
        private String fecha;
        private String nombreCliente;
        private String direccion;
        private double distanciaKm;
        private String nombreMascota;
        private String especieMascota;
        private Servicio servicio;
        private String observacionesPrevias;
        private String telefono;

        public Builder conCodigo(String a){
            codigo= a;
            return this;
        }
        public Builder conFecha(String a){
            fecha=a;
            return this;
        }
        public Builder conNombreCliente(String a){
            nombreCliente= a;
            return this;
        }public Builder conDireccion(String a){
            direccion= a;
            return this;
        }
        public Builder conDistancia(double a){
            distanciaKm= a;
            return this;
        }
        public Builder conNombreMacota(String a){
            nombreMascota= a;
            return this;
        }
        public Builder conEspecie(String a){
            especieMascota= a;
            return this;
        }
        public Builder conServicio(Servicio a){
            servicio= a;
            return this;
        }
        public Builder conObservaciones(String a){
            observacionesPrevias= a;
            return this;
        }
        public Builder conTelefono(String a){
            telefono= a;
            return this;
        }

        public Cita build(){
            return new Cita(this);
        }


    }




}
