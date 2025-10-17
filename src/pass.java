import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PIN_CORRECTA ="";
        int intentos = 0;
        do {
            System.out.println("ESCRIBA SU PIN");
            PIN_CORRECTA = sc.nextLine();
            intentos++;
            System.out.println("INTENTO "+intentos+"/3");
        }while (!PIN_CORRECTA.equals("1234")&& intentos <3);
        if (PIN_CORRECTA.equals("1234")){
            System.out.println("ACCESO PERMITIDO");
        }else {
            System.out.println("ACCESO DENEGADO");
        }
        sc.close();
    }

}
