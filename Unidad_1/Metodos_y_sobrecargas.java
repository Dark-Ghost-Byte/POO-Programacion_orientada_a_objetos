import java.util.Scanner;

public class Metodos_y_sobrecargas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el primer digito:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo digito:");
        int num2 = scanner.nextInt();

        String digitos = cuadrado (num1);
        String digitos2 = rectangulo (num1, num2);



        System.out.println(digitos);
        System.out.println(digitos2);


    }
    public static String cuadrado(int x){
        System.out.println("Area y perimetro:");
        String res = ("Area del cuadrado: " + x * x + ", ");
        String resp = (" Perimetro del cuadrado: " + x * 4);
        return res + resp;

    }

    public static String rectangulo(int j, int k) {
        String respu = ("Area del rectangulo: " + j * k + ", ");
        String respue= (" Perimetro del rectangulo: " + ((2 * j) + (2 * k)));
        return respu + respue;
    }

    public static void imprimirError (int x){
        System.out.println("Error");

    }

    public static boolean error2() {
        return true;

    }
    public static void nada(){
        //Nada
    }

}

