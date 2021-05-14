import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de provincias. \n");
        int opc=0;
        String[] zonas = new String[0];
        String[] provincias = new String[0];
        Scanner scanner=new Scanner(System.in);
         while (opc !=4) {
             System.out.println("¿Que deseas hacer? \n 1)Crear zona geografica: \n 2)Crear provincias: \n " +
                     "3)Mostrar datos: \n 4)Salir");
             opc=scanner.nextInt();
             switch (opc){
                 case 1: {
                     System.out.println("Has seleccionado la opcion 1.");
                     Scanner scanner1=new Scanner(System.in);
                     System.out.println("¿Cuantas zonas deseas crear?");
                     int zg= scanner1.nextInt();
                     zonas=new String[zg];
                     for (int x=0; x<zg; x++) {
                         System.out.println("Introduce el nombre:");
                         String no = scanner.next();
                         System.out.println("Introduce la superficie:");
                         double s = scanner.nextDouble();
                         zonas[x]= "Zona: " + no + ". Con una superficie de: " + s + " kilometros.";
                         System.out.println("\n");
                     }
                     break;
                 }// Fin del caso 1

                 case 2:{
                     System.out.println("Has seleccionado la opcion 2.");
                     Scanner scanner2=new Scanner(System.in);
                     System.out.println("¿Cuantas provincias deseas crear?");
                     int p=scanner.nextInt();
                     provincias=new String[p];
                     for (int x=0; x<p; x++){
                         System.out.println("Introduce el idioma:");
                         String i= scanner2.next();
                         System.out.println("Introduce el tipo de moneda:");
                         String m=scanner2.next();
                         System.out.println("Introduce el nombre del presidente:");
                         String pe=scanner2.next();
                         provincias[x]="El idioma es: " + i + ". Con un tipo de moneda de: " + m + ". Y el presidente se llama: " + pe + ".";
                         System.out.println("\n");
                     }
                     break;
                 }//Fin del caso 2

                 case 3: {
                     System.out.println("Mostrando datos:");
                     imprimirArreglodezona(zonas);
                     imprimirArreglodeprovincia(provincias);
                     System.out.println("\n");
                 }//Fin del caso 3

                 case 4: {
                     System.out.println("Muchas gracias por usar este sistema, hasta pronto.");
                     System.out.println("Creado: Jesús Liadeo Chávez Chávez.");
                 }// Fin del caso 4
             }//Fin del switch
         }//Fin del while
    }

    public static void imprimirArreglodezona(String[] arr) {
        for (int x1=0; x1< arr.length; x1++) {
            System.out.println(arr[x1]);
        }
    }
    public static void imprimirArreglodeprovincia(String[] arr) {
        for (int x1=0; x1< arr.length; x1++) {
            System.out.println(arr[x1]);
        }
    }
}
