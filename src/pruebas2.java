import java.util.Scanner;

public class pruebas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOLA, COMO TE LAMAS ANTES DE EMPEZAR?");
        String name = sc.nextLine();
        System.out.println("BIENVENIDO A LA TIENDA"+"___"+name);
        System.out.println("DISPONIBLE:");
        System.out.println("CAFE-1.99");
        System.out.println("BREAD-1.99");
        System.out.println("CAPUCHINO-4.99");
        System.out.println("CRACKERS-0.99");

    }
}
