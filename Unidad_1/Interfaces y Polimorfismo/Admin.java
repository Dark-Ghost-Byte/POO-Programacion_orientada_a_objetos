public class Admin extends User{

    public Admin(String name, String address, String phone, String userName, String password) {
        super(name, address, phone, userName, password);
    }
    public void changePassword(String nuevo){
        super.setPassword(nuevo);
    }
}
