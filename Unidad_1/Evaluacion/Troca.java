import java.awt.*;

public class Troca extends Vehiculo{
    private String modelo;
    private double capacidaddecarga;
    private String cabina;
    public Troca(String marca, String color, String matricula, String modelo, double capacidaddecarga, String cabina) {
        super(marca, color, matricula);
        this.modelo=modelo;
        this.capacidaddecarga=capacidaddecarga;
        this.cabina=cabina;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setCapacidaddecarga(double capacidaddecarga) {
        this.capacidaddecarga = capacidaddecarga;
    }
    public double getCapacidaddecarga() {
        return capacidaddecarga;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }
    public String getCabina() {
        return cabina;
    }
}
