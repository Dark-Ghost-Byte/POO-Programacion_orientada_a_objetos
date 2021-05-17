public class Client extends User{
    private double balance;

    public Client(String name, String lastName, String user, String password, double balance) {
        super(name, lastName, user, password);
        this.balance=balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void loadBalance (double balance){
        this.balance=this.balance+balance;
    }

    @Override
    public boolean logIn(String user, String password) {
        System.out.println("ACCESSO DENEGADO");
        return false;
        //return super.logIn(user, password);
    }

    @Override
    public void decirHola() {
        System.out.println("Decir hola desde la clase cliente");
        super.decirHola();
    }
}
