public class User extends Person{
    private String userName;
    private String password;

    public User(String name, String address, String phone, String userName, String password) {
        super(name, address, phone);
        this.userName=userName;
        this.password=password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
