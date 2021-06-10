public class Principal {
    public static void main(String[] args) {
        Admin admin= new Admin("Admin", "Calle pinocho", "123123", "Admin", "123");
        Cashier cashier1= new Cashier("Cajero1", "Calle pepe", "456789", "Cajero1", "123");
        cashier1.makePayment();
        User cashier2= new Cashier("Cajero1", "Calle pepe", "456789", "Cajero1", "123");

        Client client1= new Client("Jose", "Calle quesadilla", "147258", 0, 2000);
        Order order1= new Order(client1, cashier1);
        System.out.println(order1.getTotal());

    }
}
