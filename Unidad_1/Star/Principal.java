import java.awt.*;
import java.util.Scanner;

public class Principal {
    private static String name;

    public static void main(String[] args) {
        //Variable = Construye inicializada
        /*
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

         */

        int opcion=0;
        Scanner scanner=new Scanner(System.in);
        while (opcion!=4){
            System.out.println("¿Qué desea hacer? \n 1)Crear Estrella \n 2)Crear Asteroide \n 3)Crear Planeta \n 4)Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1: {
                    //Crear estrella

                    System.out.println("Introduce el diametro:");
                    double d= scanner.nextDouble();

                    System.out.println("Introduce el tipó de la estrella: 1)Enana roja. 2)Enana blanca");
                    int t=scanner.nextInt();
                    String tipo ="";
                    if (t==1){
                        tipo="Enana roja.";
                    }
                    else if (t==2){
                        tipo="Enana blanca.";
                    }
                    else {
                        tipo="Estrella normal.";
                    }

                    System.out.println("El color de la estrella es: 1)Rojo. 2)Azul.");
                    int c=scanner.nextInt();
                    Color color=Color.BLACK;
                    if (c==1){
                        color=Color.RED;
                    }
                    else if (c==2){
                        color=Color.BLUE;
                    }

                    Star estrella1=new Star(d, tipo, color);
                    System.out.println("La estrella que creaste es: Diametro:"+estrella1.getDiameter()
                            +" de Tipo: "+estrella1.getType()+" de Color: "+estrella1.getColor().toString());
                    break;
                }

                case 2: {
                    //Crear asteriode
                    System.out.println("Introduce nombre: 1)2077-TU24. 2)2012-BX34. 3)2017-AG13.");
                    int n=scanner.nextInt();
                    String nombre="Asteriode no identificado.";
                    if (n==1) {
                        nombre="2077-TU24.";
                    }
                    else if (n==2) {
                        nombre="2012-BX34.";
                    }
                    else if (n==3) {
                        nombre="2017-AG13.";
                    }

                    System.out.println("Composicion: 1)Solida. 2)Gaseoso. 3)Liquido.");
                    int c=scanner.nextInt();
                    String composicion="Composicion no encontrada.";
                    if (c==1) {
                        composicion="Solida." ;
                    }
                    else if (c==2) {
                        composicion="Gaseosa.";
                    }
                    else if (c==3) {
                        composicion="Liquido.";
                    }

                    System.out.println("Introduce la distacia de la tierra al asteroide:");
                    double d=scanner.nextDouble();

                    System.out.println("Introduce la velocidad:");
                    double s=scanner.nextDouble();

                    Asteroid astreroide1=new Asteroid(nombre,composicion, d, s);
                    System.out.println("La estrella se llama: "+astreroide1.getName()
                    +" de Composicion: "+astreroide1.getComposition()+" de Distacia de la tierra: "
                    +astreroide1.getDistance_of_earth()+" de Velocidad: "+ astreroide1.getSpeed());

                    break;
                }

                case 3: {
                    //Crear planeta
                    System.out.println("Introduce el nombre del planeta: 1)Mercurio. 2)Venus. 3)Tierra.");
                    int n=scanner.nextInt();
                    String nombre="Planeta no encontrado.";
                    if (n==1) {
                        nombre="Mercurio." ;
                    }
                    else if (n==2) {
                        nombre="Venus.";
                    }
                    else if (n==3) {
                        nombre="Tierra.";
                    }

                    System.out.println("Introduce la distancia de la tierra al sol:");
                    double ds=scanner.nextDouble();

                    System.out.println("Composicion: 1)Solida. 2)Gaseoso. 3)Liquido.");
                    int c=scanner.nextInt();
                    String composicion="Composicion no encontrada.";
                    if (c==1) {
                        composicion="Solida." ;
                    }
                    else if (c==2) {
                        composicion="Gaseosa.";
                    }
                    else if (c==3) {
                        composicion="Liquido.";
                    }

                    System.out.println("Introduce los dias de orbitas:");
                    int od=scanner.nextInt();

                    System.out.println("Introduce la masa:");
                    double m=scanner.nextDouble();

                    Planet planet1=new Planet(nombre,ds, composicion,od, m);
                    System.out.println("El planeta se llama: "+planet1.getName()+" de Distacia del sol: "
                    +planet1.getSun_distance()+" de Composicion: "+planet1.getComposition()
                    +" de Dias de orbita: "+planet1.getOrbit_days()+" de Masa: "+planet1.getMass());

                    break; }


                case 4: { break; }

                default:{
                    System.out.println("Opcion no valida.");
                }

            }//Llave switch

        }//Llave while

        System.out.println("Gracias por utilizar el sistema.");

    }//LLave main

}//Llave class
