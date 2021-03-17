import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("Has vivido " + (edad * (365*24) + " horas.") );
        if (edad<13){
            System.out.println("Eres aun un niño.");

        }
        else if (edad>=12 && edad<26 ){
            System.out.println("Eres un joven.");
        }

        else if(edad>=26 && edad<100){
            System.out.println("Eres un adulto.");
        }

        System.out.println("Introduce un numero:");
        int veces = scanner.nextInt();
        if (veces >=0 && veces<=10){
            for(int j = 1; j<11; j++) {
            String numero1 = "%d x %d = %d";
            String numero2 = String.format(numero1, veces, j, veces * j);
            System.out.println(numero2);
        }

        }

        else if(!(veces<0 && veces>10)) {
            System.out.println("Error de consola.");
        }

    }

}
