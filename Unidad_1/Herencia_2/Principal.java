import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema." );
        int op=0;
        Celular celular[] = new Celular[0];
        PC computadora[] = new PC[0];
        Servidor servidor[];
        Scanner scanner=new Scanner(System.in);
        while (op !=5) {
            System.out.println("¿Que deseas hacer? \n 1)Crear celular. \n 2)Crear computadora. \n 3)Crear servidor. \n " +
                    "4)Funciones especiales. \n 5)Salir.");
            op=scanner.nextInt();
            switch (op){
                case 1: {
                    System.out.println("Seleccionaste la primera opcion.");
                    System.out.println("¿Cuantos celulares deseas crear?");
                    int cel= scanner.nextInt();
                    celular= new Celular[cel];
                    for (int x=0; x<cel; x++){
                        System.out.println("Introduce nombre:");
                        String no = scanner.next();
                        System.out.println("Introduce memoria RAM:");
                        double mr = scanner.nextDouble();
                        System.out.println("Introduce procesador:");
                        String pr = scanner.next();
                        System.out.println("Introduce saldo:");
                        double sa = scanner.nextDouble();
                        Celular cl= new Celular(no, mr, pr, sa);
                        celular[x]=cl;
                        System.out.println("");
                    }
                    System.out.println("Se han guadardo los datos:");
                    break;
                }//Fin del caso 1

                case 2: {
                    System.out.println("Seleccionaste la segunda opcion.");
                    System.out.println("Cuantas computadoras deseas crear:");
                    int com= scanner.nextInt();
                    computadora= new PC[com];
                    for (int x=0; x<com; x++){
                        System.out.println("Introduce nombre:");
                        String no = scanner.next();
                        System.out.println("Introduce memoria RAM:");
                        double mr = scanner.nextDouble();
                        System.out.println("Introduce procesador:");
                        String pr = scanner.next();
                        System.out.println("Introduce la marca del teclado:");
                        String mt = scanner.next();
                        PC pc= new PC(no, mr, pr, mt);
                        computadora[x]=pc;
                        System.out.println("");
                    }
                    System.out.println("Se han guadardo los datos:");
                    break;
                }//Fin del caso 2

                case 3: {
                    System.out.println("Seleccionaste la tercera opcion.");
                    System.out.println("¿Cuantos servidores deseas crear?");
                    int ser= scanner.nextInt();
                    servidor = new Servidor[ser];
                    for (int x=0; x<ser; x++){
                        System.out.println("Introduce nombre:");
                        String no = scanner.next();
                        System.out.println("Introduce memoria RAM:");
                        double mr = scanner.nextDouble();
                        System.out.println("Introduce procesador:");
                        String pr = scanner.next();
                        System.out.println("Introduce atributo:");
                        String ar = scanner.next();
                        System.out.println("Introduce zona horaria:");
                        double zh = scanner.nextDouble();
                        Servidor serv= new Servidor(no, mr, pr, ar, zh);
                        servidor[x]= serv;
                        System.out.println("");
                    }
                    System.out.println("Se han guadardo los datos:");
                    break;
                }//Fin del caso

                case 4:{
                    System.out.println("Seleccionaste la cuarta opcion.");
                    System.out.println("Que funcion especial deseas realizar:");
                    int fun=0;
                    while (fun !=4){
                        System.out.println("1)Enviar SMS. \n2)Encender Webcam. \n3)Aumentar RAM. \n4)Salir.");
                        fun= scanner.nextInt();
                        switch (fun){
                            case 1: {
                                System.out.println("Seleccionaste enviar un SMS.");
                                System.out.println("¿Cual es el mensaje?");
                                String sms= scanner.next();
                                imprimirArreglodecelular(celular);
                                System.out.println("");
                                break;
                            }

                            case 2: {
                                System.out.println("Seleccionaste encender camara:");
                                System.out.println("Webcam encendida.");
                                System.out.println("");
                                break;
                            }

                            case 3: {
                                System.out.println("Seleccionaste Aumentar RAM:");
                                System.out.println("¿Cuanta RAM te gustaria aumentar?");
                                double ram = scanner.nextDouble();
                                System.out.println("Se aumento "+ ram+ " a la RAM principal.");
                                impromirArreglodecomputadora(computadora);
                                System.out.println("");
                                break;
                            }
                            case 4: {
                                System.out.println("Saliendo.");
                                System.out.println("");
                                break;
                            }
                            default:{
                                System.out.println("Esa opcion no esta disponible.");
                            }
                        }
                    }
                }
                case 5: {
                    System.out.println("Gracias por usa el sistema operativo.");
                    System.out.println("Creador: Jesús Liadeo Chávez Chávez.");
                    System.out.println("");
                }
                default: {
                    System.out.println("Esta opcion no esta disponible.");
                }

            }
        }

    }
    public static void imprimirArreglodecelular(Celular[] arr){
        for (int x1=0; x1< arr.length; x1++){
            System.out.println(arr[x1]);
        }
    }
    public static void impromirArreglodecomputadora(PC[] arr){
        for (int x1=0; x1< arr.length; x1++){
            System.out.println(arr[x1]);
        }
    }
    public static void imprimirArreglodeservidor(Servidor[] arr){
        for (int x1=0; x1< arr.length; x1++){
            System.out.println(arr[x1]);
        }
    }
}
