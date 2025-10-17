import java.util.Scanner;
public class proyecto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("----MENU DE OPCIONES DE OPERACION----");
            System.out.println("1   SUMAR");
            System.out.println("2   RESTAR");
            System.out.println("3   MULTIPLICAR");
            System.out.println("4   DIVIDIR");
            System.out.println("0   SALIR");
            int operacion = sc.nextInt();
        System.out.println("ELIJE EL PRIMER DIGITO EJEMPLO 1-10");
        int a = sc.nextInt();
        System.out.println("ELIJE SEGUNDO DIGITO ");
        int b = sc.nextInt();
        sc.nextLine();
            if (operacion == 1) {
                int resultado = SUMAR(a, b);
                System.out.println("RESULTADO:" + resultado);
            } else if (operacion == 2) {
                int resultado = RESTAR(a, b);
                System.out.println("RESULTADO:" + resultado);
            } else if (operacion == 3) {
                int resultado = MULTIPICLAR(a, b);
                System.out.println("RESULTADO:" + resultado);
            } else if (operacion == 4) {
                double resultado = DIVIDIR(a, b);
                System.out.println("RESULTADO:" + resultado);
        }
    }
    public static int SUMAR(int a, int b) {
        return a + b;
    }

    public static int RESTAR(int a, int b) {
        return a - b;
    }

    public static int MULTIPICLAR(int a, int b) {
        return a * b;
    }

    public static double DIVIDIR(int a, int b) {
        return (double) a/b;
    }
}
