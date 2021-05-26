public class PC extends Dispositivo{
    public String marcaTeclado;

    public PC(String nombre, double memoriaRam, String procesador, String marcaTeclado){
        super(nombre, memoriaRam, procesador);
        this.marcaTeclado=marcaTeclado;
    }

    public PC(String nombre, double memoriaRam, String procesador) {
        super(nombre, memoriaRam, procesador);
    }

    public void setMarcaTeclado(String marcaTeclado) {
        this.marcaTeclado = marcaTeclado;
    }
    public String getMarcaTeclado() {
        return marcaTeclado;
    }
}
