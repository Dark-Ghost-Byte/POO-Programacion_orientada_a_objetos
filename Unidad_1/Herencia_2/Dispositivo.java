public class Dispositivo {
    private String nombre;
    private double memoriaRam;
    public String procesador;

    public Dispositivo(String nombre, double memoriaRam, String procesador){
        this.nombre=nombre;
        this.memoriaRam=memoriaRam;
        this.procesador=procesador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String getProcesador() {
        return procesador;
    }
}
