import java.util.Scanner;

public class Order implements NewOrder{
    private double total;
    private Part[] partes;
    private Client client;
    private Cashier cashier;
    public Order(Client client, Cashier cashier){
        this.client=client;
        this.cashier=cashier;
        this.setParts();
    }
    @Override
    public void setParts() {
        System.out.println("Cuantas partes necesitas:");
        Scanner scanner= new Scanner(System.in);
        int cuantas= scanner.nextInt();
        partes= new Part[cuantas];
        for (int x=0; x<cuantas;x++){
            //System.out.println("Name:");
            //Part part= new Part("Parte", 200*x, "Tal");
            partes[x]=new Part("Parte", 200*x, "Tal");
        }
        this.setTotal();

    }

    @Override
    public void setClient() {

    }

    @Override
    public void setTotal() {
        for (int x=0; x<partes.length;x++){
            total= total+ partes[x].getPrice();
        }
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
