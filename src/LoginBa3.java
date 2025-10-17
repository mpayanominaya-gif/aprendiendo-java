import java.util.Scanner;

public class LoginBa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = {"Miguel"};
        int[] pins = {1234};
        int intentos=0;
        int numeroDeDocumento=75638489;
        String fechaDeNacimiento="21-12-2010";
        String generoPersona="Masculino";
        boolean accesoPermitido=false;
        do {
            System.out.println("INGRESA TU NOMBRE:");
            String nombre = sc.nextLine();

            System.out.println("INGRESA TU PIN");
            int pin = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < nombres.length; i++){
                if (nombres[i].equals(nombre)&& pins[i]==pin) {
                    accesoPermitido = true;
                    break;
                }
            }
            intentos++;
            if (!accesoPermitido) {
                System.out.println("DATOS INCORRECTOS. INTENTO " + intentos + "/3");
        }
        }while (!accesoPermitido && intentos <3);
if (accesoPermitido){
    System.out.println("✅ ACCESO PERMITIDO, BIENVENID@!");
    opcionElegida(sc,numeroDeDocumento,generoPersona,fechaDeNacimiento);
}else {
    System.out.println("❌ ACCESO BLOQUEADO POR DEMASIADOS INTENTOS");
}
sc.close();
    }public static void opcionElegida(Scanner sc,int numeroDeDocumento,String generoPersona, String fechaDeNacimiento){
        int opcion;
        do {
            System.out.println("ELIGE UNA OPCION:");
            System.out.println("1-NU.DOCUMENTO");
            System.out.println("2-FECHA DE NACIMIENTO");
            System.out.println("3-GENERO DE PERSONA");
            System.out.println("4-FINALIZAR SESION");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("NUMERO DE DOCUMENTO:" + numeroDeDocumento+"✅");
                    break;
                case 2:
                    System.out.println("FECHA DE NACIMIENTO:" + fechaDeNacimiento+"✅");
                    break;
                case 3:
                    System.out.println("GENERO DE PERSONA:" + generoPersona+"✅");
                    break;
                case 4:
                    finalizarSesion();
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }while (opcion != 4);
    }public static void finalizarSesion(){
        System.out.println("SESION CULMINADA❌");
        System.out.println("CAMBIO 2");
    }
}
