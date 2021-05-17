public class Principal {
    public static void main(String[] args) {
        User user1= new User( "Liadeo", "Chavez", "Darkliam", "041202");
        //boolean answer = user1.logIn("Darkliam", "041202");
        boolean answer = user1.logIn("Darkliam", "041201");
        //System.out.println("Login: "+answer);
        //user1.checkCharge();

        Client client1=new Client("Juan", "Mendoza", "Juanc1", "123456", 100);
        client1.loadBalance(100);
        System.out.println("Saldo: "+ client1.getBalance());

        boolean answer2= client1.logIn("Juanc1", "123456");
        System.out.println("Login: "+ answer2);
        client1.decirHola();


    }
}
