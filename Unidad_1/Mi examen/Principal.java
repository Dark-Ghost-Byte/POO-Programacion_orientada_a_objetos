import java.security.DrbgParameters;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de hoteles.");
        //double capacidad[]=new double[0];
        int res=0;
        Reservacion reservacion[]=new Reservacion[0];
        String[] reservacion1 = new String[0];
        Scanner scanner=new Scanner(System.in);
        while(res !=3){
            System.out.println("¿Que deseas hacer?");
            System.out.println("1)Resevar. \n2)Mostrar datos. \n3)Salir.");
            res=scanner.nextInt();
            switch (res){
                case 1: {
                    System.out.println("Seleccionaste la opcion 1.");
                    System.out.println("¿Cuantas reservaciones quieres hacer?:");
                    int num= scanner.nextInt();
                    reservacion=new Reservacion[num];
                    reservacion1=new String[num];
                    for (int x=0; x<num; x++) {
                        System.out.println("");
                        System.out.println("Introduce el nombre del Hotel:");
                        String no = scanner.next();
                        System.out.println("Introduce fecha (DD/MM/AAAA):");
                        String fe = scanner.next();
                        System.out.println("¿Cuantos dias se van a quedar?:");
                        double cd = scanner.nextDouble();
                        System.out.println("¿Cuantas habitaciones van a ser?:");
                        double ha = scanner.nextDouble();
                        System.out.println("Precio por habitacion es de $800.00");
                        int ph = 800;
                        int pf = (int) (ph * ha);
                        System.out.println("El precio final sera: $" + pf);
                        System.out.println("¿Cuanto van a dar de anticipado?:");
                        double an = scanner.nextDouble();
                        int rpp = (int) (pf - (an));
                        if (an < pf) {
                            int rppa = (int) (pf - (an));
                            System.out.println("Se quedara deviendo $" + rppa);
                        } else if (an > pf) {
                            System.out.println("No se puede realizar su reservacion intente de nuevo.");
                        }
                        Reservacion nm = new Reservacion(no, 0, 25, fe, cd, an);
                        //String reser= new String();
                        reservacion[x]=nm;
                        reservacion1[x]="Hotel: "+no+".\nFecha: "+fe+".\nEstancia(Dias): "+cd+"\nAnticipo: $"+an+
                        "\nRestante por pagar: $"+rpp+"\n";
                    }
                    break;
                }

                case 2: {
                    System.out.println("Mostrando datos.");
                    imprimirReservaciones(reservacion);
                    imprimirReservacionestext(reservacion1);
                    break;
                }

                case 3: {
                    System.out.println("Muchas gracias por usar este sistema operativo de hoteles.");
                    System.out.println("Creador: Jesús Liadeo Chávez Chávez.");
                    break;
                }
                default: {
                    System.out.println("Esa opcion no esta disponible. \n");
                    break;
                }


            }
        }
    }
    public static void imprimirReservaciones(Reservacion[] arr) {
        for (int x1 = 0; x1 < arr.length; x1++) {
            System.out.println(arr[x1]);
        }
    }
    public static void imprimirReservacionestext(String[] arr) {
        for (int x1 = 0; x1 < arr.length; x1++) {
            System.out.println(arr[x1]);
        }
    }
}
