public class User {
    private String name;
    private String lastName;
    private String user;
    private String password;

    public User (String name, String lastName, String user, String password) {
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public boolean logIn (String user, String password){
        if(user.equals(this.user) && password.equals(this.password)){
            return true;
        }
        else {
            return false;
        }

    }

    public void decirHola(){
        System.out.println("Decir hola desde la clase usuario");
    }

    private int checkCharge(){
        return 500*15;
    }
    public void salir(){
        System.out.println("Salir.");
    }

}

