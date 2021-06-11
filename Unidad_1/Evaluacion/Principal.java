import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Variante variante = new Variante("Ford", "Rojo", "12MAC57", "Mustang", 500, "Depotivo");
        Troca troca = new Troca("GMC", "Negro", "845LI74", "Sierra Denali", 950, "Doble cabina");
        System.out.println("Bienvenido ha sistema de vehiculos");
        int res = 0;
        Variante variante1[] = new Variante[0];
        String[] variante2 = new String[0];
        Troca troca1[] = new Troca[0];
        String[] troca2 = new String[0];
        Scanner scanner = new Scanner(System.in);
        while (res != 5) {
            System.out.println("Que te gustaria hacer:");
            System.out.println("1)Pedir carro. \n2)Pedir troca. \n3)Mostrar datos (Carro o carros). " +
                    "\n4)Mostrar datos (Troca o trocas).\n5)Salir");
            res = scanner.nextInt();
            switch (res) {
                case 1: {
                    System.out.println("Seleccionaste la primera opcion.");
                    System.out.println("Cuantos carros te gustaria pedir:");
                    int num = scanner.nextInt();
                    variante1 = new Variante[num];
                    variante2 = new String[num];
                    for (int x = 0; x < num; x++) {
                        System.out.println("");
                        System.out.println("Introduce marca del vehiculo:");
                        String ma = scanner.next();
                        System.out.println("Introduce el color:");
                        String co = scanner.next();
                        System.out.println("Introduce la matricula:");
                        String mat = scanner.next();
                        System.out.println("Introduce el modelo:");
                        String mo = scanner.next();
                        System.out.println("¿Cual seria su potencia CV?");
                        double pcv = scanner.nextInt();
                        System.out.println("Que tipo de auto seria (Deportivo o Sencillo)");
                        String ti = scanner.next();
                        Variante va = new Variante(ma, co, mat, mo, pcv, ti);
                        variante1[x] = va;
                        variante2[x] = "Marca: " + ma + ".\nColor: " + co + ".\nMatricula: " + mat + ".\nModelo: " + mo +
                                ".\nPotenciaCV: " + pcv + ".\nTipo: " + ti + ".\n";
                    }
                    break;
                }

                case 2: {
                    System.out.println("Seleccionaste la segunda opcion.");
                    System.out.println("Cuantas trocas te gustaria pedir:");
                    int num = scanner.nextInt();
                    troca1 = new Troca[num];
                    troca2 = new String[num];
                    for (int x = 0; x < num; x++) {
                        System.out.println("");
                        System.out.println("Introduce marca de la troca:");
                        String ma = scanner.next();
                        System.out.println("Introduce el color:");
                        String co = scanner.next();
                        System.out.println("Introduce la matricula:");
                        String mat = scanner.next();
                        System.out.println("Introduce el modelo:");
                        String mo = scanner.next();
                        System.out.println("¿Cual seria su capacidad de carga?");
                        double cdc = scanner.nextInt();
                        System.out.println("Que tipo de cabina seria (Regular o Doble)");
                        String ca = scanner.next();
                        Troca tr = new Troca(ma, co, mat, mo, cdc, ca);
                        troca1[x] = tr;
                        troca2[x] = "Marca: " + ma + ".\nColor: " + co + ".\nMatricula: " + mat + ".\nModelo: " + mo +
                                ".\nCapacidad de carga: " + cdc + ".\nCabina: " + ca + ".\n";
                    }
                        break;
                    }
                    case 3: {
                        System.out.println("Mostrando datos:");
                        imprimirVariantes(variante1);
                        imprimirVariantestext(variante2);
                        break;
                    }
                    case 4: {
                        System.out.println("Mostrando datos:");
                        imprimirTroca(troca1);
                        imprimirtrocatext(troca2);
                        break;
                    }
                case 5: {
                    System.out.println("Muchas gracias por usar estes sistema de vehiculos.");
                    System.out.println("Creador Jesús Liadeo Chávez Chávez.");
                    break;
                }
                    default: {
                        System.out.println("Esa opcion no esta disponible.\n");
                        break;
                    }

            }
        }
    }
        public static void imprimirVariantes(Variante[] arr) {
        for (int x1=0;x1< arr.length;x1++){
            System.out.println(arr[x1]);
        }
    }
    public static void imprimirVariantestext(String[] arr) {
        for (int x1=0;x1< arr.length;x1++){
            System.out.println(arr[x1]);
        }
    }
    public static void imprimirTroca(Troca[] arr) {
        for (int x1=0;x1< arr.length;x1++){
            System.out.println(arr[x1]);
        }
    }
    public static void imprimirtrocatext(String[] arr) {
        for (int x1=0;x1< arr.length;x1++){
            System.out.println(arr[x1]);
        }
    }
}
