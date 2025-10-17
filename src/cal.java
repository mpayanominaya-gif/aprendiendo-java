import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ELIGE UNA OPCION:");
        System.out.println("1-MENU");
        System.out.println("2-FINALIZAR SESION");
        int opcion = sc.nextInt();
        if (opcion == 1){
            menu();
        }else if (opcion == 2){
            sesionCerrada();
        }else {
            System.out.println("NUMERO INCORRECTO");
            sesionCerrada();
        }
        sc.close();
    }public static void menu(){
        System.out.println("MENU");  //no pondre nada por ser solo un ejemplo de lo qeu aprendi supongo//
    }
    public static void sesionCerrada(){
        System.out.println("SESION CERRADA");
    }

}
