import java.util.Scanner;

public class LoginBa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userCorrect = "Miguel";
        int edadCorrecta =18;
        int pinCorrect = 211210;
        int documento = 75638489;
        String fechaDeNacimiento= "21-12-2010";
        String genero ="Masculino";
        int intentosNum = 0;
        String userName;
        do {
            System.out.println("NOMBRE DE USUARIO:");
            userName = sc.nextLine();
            intentosNum++;
            System.out.println("INTENTO " + intentosNum + "/3");
        } while (!userName.equals(userCorrect) && intentosNum < 3);

        if (userName.equals(userCorrect)) {
            System.out.println("BIENVENIDO " + userCorrect);
            pin(sc, pinCorrect, documento, fechaDeNacimiento, genero);
        } else {
            System.out.println("MUCHOS INTENTOS FALLIDOS");
        }

        sc.close();
    }
    public static void pin(Scanner sc, int pinCorrect, int documento, String fechaDeNacimiento, String genero) {
        int intentos =0;
        int pinIngresado;
        do {
            System.out.println("INGRESA SU PIN:");
            pinIngresado = sc.nextInt();
            sc.nextLine();
            intentos++;
            System.out.println("INTENTO " + intentos + "/3");
        } while (pinIngresado != pinCorrect && intentos < 3);

        if (pinIngresado == pinCorrect){
            System.out.println("ACCESO EXITOSO");
            menu(sc, documento, fechaDeNacimiento, genero);
        }else {
            System.out.println("ACCESO DENEGADO");
        }
    }public static void menu(Scanner sc, int documento,String fechaDeNacimiento,String genero){
        int opcionElegida;
        do {
            System.out.println("ELIGE UNA OPCION DE OPERACION:");
            System.out.println("1-DOCUMENTO");
            System.out.println("2-FECHA DE NACIMIENTO");
            System.out.println("3-GENERO");
            System.out.println("4-FINALIZAR SESION");
            opcionElegida = sc.nextInt();
            sc.nextLine();
            switch (opcionElegida) {
                case 1:
                    System.out.println("DOCUMENTO:" + documento);
                    break;
                case 2:
                    System.out.println("FECHA DE NACIMIENTO:" + fechaDeNacimiento);
                    break;
                case 3:
                    System.out.println("GENERO" + genero);
                    break;
                case 4:
                    System.out.println("SESION FINALIZADA");
                    break;
                default:
                    System.out.println("OPCIONA INVALIDA");
            }
        }while (opcionElegida != 4);
    }
}
