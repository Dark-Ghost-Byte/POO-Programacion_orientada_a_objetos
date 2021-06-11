import java.awt.*;

public abstract class Vehiculo {
    private String marca;
    private String color;
    private String matricula;
    public Vehiculo(String marca, String color, String matricula){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
    }

    public void setMarca(String modelo) {
        this.marca = modelo;
    }
    public String getMarca() {
        return marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
}
