import java.util.Scanner;

public class Reservacion extends Hotel{
    private String fechaIncio;
    private double dias;
    private double anticipo;

    public Reservacion(String nombre, double ocupadas, double disponibles, String fechaIncio, double dias, double anticipo){
        super(nombre, ocupadas, disponibles);
        this.fechaIncio=fechaIncio;
        this.dias=dias;
        this.anticipo=anticipo;
    }

    public void setFechaIncio(String fechaIncio) {
        this.fechaIncio = fechaIncio;
    }
    public String getFechaIncio() {
        return fechaIncio;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }
    public double getDias() {
        return dias;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;
    }
    public double getAnticipo() {
        return anticipo;
    }

    @Override
    public void imprimirCapacidad(double ocupadas, double disponibles) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cuantas reservaciones han hecho:");
        int reservaciones= scanner.nextInt();
        if (reservaciones<50){
            System.out.println("Hay un total de "+(50-reservaciones)+".");
        }
        else if (reservaciones>50){
            System.out.println("No se puede acompletar el proceso.");

        }
    }

    public void imprimirProcentaje(double ocupadas, double disponibles){
        System.out.println("El porcentaje de habitaciones disponibles es:");
        Scanner scanner=new Scanner(System.in);
        int capa=50;
        int ocupa= scanner.nextInt();
        int por=100;
        int resultado=(int)((por/capa)*ocupa);
    }

    public void imprimirTicket(double ocupadas, double disponibles){
        System.out.println("Ticket:");
        System.out.println("------------------------------");
        System.out.println("Hotel:");
        System.out.println("Fecha:");
        System.out.println("Estancia(Dias):");
        System.out.println("Anticipo:");
        System.out.println("Restante por pagar:");
        System.out.println("------------------------------");

    }
}
