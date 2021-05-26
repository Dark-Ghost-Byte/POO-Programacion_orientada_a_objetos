public class Servidor extends PC{
    public String atributte1;
    public double zonaHoraria;

    public Servidor(String nombre, double memoriaRam, String procesador, String atributte1,
                    double zonaHoraria){
        super(nombre, memoriaRam, procesador);
        this.atributte1=atributte1;
        this.zonaHoraria=zonaHoraria;
    }

    public void setAtributte1(String atributte1) {
        this.atributte1 = atributte1;
    }
    public String getAtributte1() {
        return atributte1;
    }

    public void setZonaHoraria(double zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }
    public double getZonaHoraria() {
        return zonaHoraria;
    }
}
