import java.util.Scanner;

public class LoginBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String UserName = "Miguel";
        boolean GeneroMasculino = true;
        double altura = 1.75;
        double masa = 75.7;
        int pinUser = 211210;
        int saldo = 1000;
        int documentoIdentidad = 75638489;
        String s = 21 + "-" + 12 + "-" + "2000";
        String FechaDeNacimiento = s;
        System.out.println("INGRESE EL NOMBRE DE USUARIO");
        String nombre = sc.nextLine();
        if (nombre.equals(UserName)) {
            System.out.println("BIENVENIDO " + UserName);
            System.out.println("INGRESE SU PIN PARA ACCEDER");
            int contraseña = sc.nextInt();
            if (contraseña == pinUser) {
                System.out.println("ACCESO CON EXITO");
                System.out.println("ELIGA UNA OPCION" +
                        "1-SALDO ACTUAL" +
                        "2-NUMERO DE DOCUMENTO DE IDENTIDAD" +
                        "3-FECHA DE NACIMIENTO" +
                        "4-DATOS ESPECIFICOS__"+" 5-FINALIZAR SESION");
                int opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("SALDO ACTUAL:"+saldo + "-DOLARES");
                } else if (opcion == 2) {
                    System.out.println(documentoIdentidad);
                } else if (opcion == 3) {
                    System.out.println(FechaDeNacimiento);
                } else if (opcion== 4){
                    System.out.println("PESO EN KG:"+masa+" ALTURA:"+altura+"CM");
                } else if (opcion == 5) {
                    System.out.println("SESION FINALIZADA");
                }else {
                    System.out.println("NUMERO NO VALIDO--->SESION CERRADA");
                }
            } else {
                System.out.println("CONTRASEÑA INCORRECTA");
                System.out.println("INTENTE DE NUEVO");
                int intento2 = sc.nextInt();
                if (intento2 == pinUser) {
                    System.out.println("ACCESO CON EXITO");
                    System.out.println("ELIGA UNA OPCION" +
                            "1-SALDO ACTUAL__" +
                            "2-NUMERO DE DOCUMENTO DE IDENTIDAD__" +
                            "3-FECHA DE NACIMIENTO__" +
                            "4-DATOS ESPECIFICOS__"+"5-FINALIZAR SESION");
                    int opcion = sc.nextInt();
                    if (opcion == 1) {
                        System.out.println("SALDO ACTUAL:"+saldo + "-DOLARES");
                    } else if (opcion == 2) {
                        System.out.println(documentoIdentidad);
                    } else if (opcion == 3) {
                        System.out.println(FechaDeNacimiento);
                    } else if (opcion == 4){
                        System.out.println("PESO EN KG:"+masa+" ALTURA:"+altura+"CM");
                    } else if (opcion == 5) {
                        System.out.println("SESION FINALIZADA");
                    }else {
                        System.out.println("NUMERO NO VALIDO--->SESION CERRADA");
                    }
                } else {
                    System.out.println("ACCESO DENEGADO");
                }
            }

        } else {
            System.out.println("NOMBRE INCORRECTO");
            System.out.println("PRESIONE ALT+F5");
        }
    }
}