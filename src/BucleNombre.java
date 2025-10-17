import java.util.Scanner;

public class BucleNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";

        while (!nombre.equals("Miguel")) {
            System.out.println("ESCIBRE TU NOMBRE:");
            nombre = sc.nextLine();
        }
        System.out.println("ACCESO PERMITIDO");
    }
}
