public class Abono {
    private String motivo;
    private double anticipo;
    public Abono(String motivo, double anticipo){
        this.motivo=motivo;
        this.anticipo=anticipo;
    }

    public void setMotivo(String nombre) {
        this.motivo = nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;
    }

    public double getAnticipo() {
        return anticipo;
    }
}
