import java.awt.*;

public class Carro extends Vehiculo{
    private String modelo;
    private double potenciacv;
    public Carro(String marca, String color, String matricula, String modelo, double potenciacv) {
        super(marca, color, matricula);
        this.modelo=modelo;
        this.potenciacv=potenciacv;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setPotenciacv(double potenciacv) {
        this.potenciacv = potenciacv;
    }
    public double getPotenciacv() {
        return potenciacv;
    }
}
