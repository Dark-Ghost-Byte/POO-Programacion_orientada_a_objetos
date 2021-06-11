import java.util.Scanner;

public class Order implements NewOrder {
    private double precio;
    private Abono[] abono;
    private Vehiculo vehiculo;
    public Order(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
        this.setAbono();
    }

    @Override
    public void setAbono() {
        System.out.println("Cuanto vas a dar de anticipado");
        Scanner scanner= new Scanner(System.in);
        int anticipo= scanner.nextInt();
        abono=new Abono[anticipo];
        for (int x=0; x<anticipo; x++){
            abono[x]=new Abono("Venta", 50000);
        }

    }

    @Override
    public void setVehiculo() {

    }

    @Override
    public void setPrecio() {
        for (int x=0; x<abono.length;x++){
            precio= precio+ abono[x].getAnticipo();
        }

    }
}
