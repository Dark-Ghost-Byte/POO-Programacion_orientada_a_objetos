package Animales;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        /*int[] miArray= new int[4];
        String[] str;
        miArray[0]=100;
        miArray[1]=200;
        miArray[2]=300;
        miArray[3]=400;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cuantos registros quieres?");
        int c=scanner.nextInt();
        str=new String[c];
        for(int x=0; x<c; x++){
            System.out.println("Inserta nombre:");
            String n= scanner.next();
            str[x]=n;

        }//Llave for
        imprimirArreglo(str);*/

        Ave[] arrayAves= new Ave[3];
        //Ave a1=new Ave();


        Animal animalGenerico=new Animal(Color.BLACK, 20);
        Ave piolin=new Ave(Color.YELLOW, 10, "Canario.");
        Perro jack=new Perro(Color.GRAY,3,"Pitbull.");

        arrayAves[0]=piolin;
        arrayAves[1]=new Ave(Color.BLACK, 13, "Lechuza");

        System.out.println(arrayAves[1].getTipo());


        //animalGenerico.comer();
        //piolin.volar();

    }

    public static void imprimirArreglo(String[] arr) {
        for (int x=0; x<arr.length; x++){
            System.out.println(arr [x]);
            
        }

    }
}
