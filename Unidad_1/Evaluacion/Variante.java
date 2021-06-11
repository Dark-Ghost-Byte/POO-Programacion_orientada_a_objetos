import java.awt.*;

public class Variante extends Carro{
    private String tipo;
    public Variante(String marca, String color, String matricula, String modelo, double potenciacv, String tipo) {
        super(marca, color, matricula, modelo, potenciacv);
        this.tipo=tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
