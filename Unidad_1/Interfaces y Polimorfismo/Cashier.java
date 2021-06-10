public class Cashier extends User{

    public Cashier(String name, String address, String phone, String userName, String password) {
        super(name, address, phone, userName, password);
    }
    public void makePayment(){
        System.out.println("Hace cobro.");
    }
}
