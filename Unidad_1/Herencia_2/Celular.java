public class Celular extends Dispositivo{
    protected double saldo;
    //public String enviarSMS;


    public Celular(String nombre, double memoriaRam, String procesador, double saldo){
        super(nombre, memoriaRam, procesador);
        this.saldo=saldo;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }


}
