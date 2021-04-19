public class Principal {
    private static String name;

    public static void main(String[] args) {
        //Variable = Construye inicializada
        Planet tierra=new Planet("Tierra", 1500, "Solid", 365, 5454);
        Planet mercurio=new Planet("Mercurio", 900, "Solid", 50, 2000);

        Asteroid x=new Asteroid("2007 TU24", "Solid", 553512, 0.58);
        Asteroid y=new Asteroid("2012 BX34", "Solid", 59044, 1.48);
        Asteroid z=new Asteroid("2017 AG13", "Solid", 384400, 16);


    }
}
