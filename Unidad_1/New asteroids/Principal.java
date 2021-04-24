public class Principal {
    private static String name;

    public static void main(String[] args) {
        //Variable = Construye inicializada
        Planet tierra=new Planet("Tierra", 1500, "Solid", 365, 5454);
        Planet mercurio=new Planet("Mercurio", 900, "Solid", 50, 2000);

        Asteroid x=new Asteroid("2007 TU24", "Solid", 553512, 0.58);
        Asteroid y=new Asteroid("2012 BX34", "Solid", 59044, 1.48);
        Asteroid z=new Asteroid("2017 AG13", "Solid", 384400, 16);

        System.out.println(x.getName());
        System.out.println(y.getName());
        System.out.println(z.getName());
        x.setName("Asteroid: 2077-TU24");
        y.setName("Asteroid: 2012-BX34");
        z.setName("Asteroid: 2017-AG13");
        System.out.println(x.getName());
        System.out.println(y.getName());
        System.out.println(z.getName());

        System.out.println(x.getComposition());
        System.out.println(y.getComposition());
        System.out.println(z.getComposition());
        x.setComposition("Composition: Solid");
        y.setComposition("Composition: Solid");
        z.setComposition("Composition: Solid");
        System.out.println(x.getComposition());
        System.out.println(y.getComposition());
        System.out.println(z.getComposition());

        System.out.println(x.getDistance_of_earth());
        System.out.println(y.getDistance_of_earth());
        System.out.println(z.getDistance_of_earth());
        x.setDistance_of_earth(553512.00);
        y.setDistance_of_earth(59044.00);
        z.setDistance_of_earth(384400.00);
        System.out.println(x.getDistance_of_earth());
        System.out.println(y.getDistance_of_earth());
        System.out.println(z.getDistance_of_earth());

        System.out.println(x.getSpeed());
        System.out.println(y.getSpeed());
        System.out.println(z.getSpeed());
        x.setSpeed(0.58);
        y.setSpeed(1.48);
        z.setSpeed(16);
        System.out.println(x.getSpeed());
        System.out.println(y.getSpeed());
        System.out.println(z.getSpeed());

    }
}
