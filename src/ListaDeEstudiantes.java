import java.util.Scanner;

public class ListaDeEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa nombre,apellido y edad de cada estudiante..");
        {
            String estudiante1 = sc.nextLine();
            System.out.println("edad1");
            int edad1 = sc.nextInt();
            sc.nextLine();
            String estudiante2 = sc.nextLine();
            System.out.println("edad2");
            int edad2 = sc.nextInt();
            sc.nextLine();
            String estudiante3 = sc.nextLine();
            System.out.println("edad3");
            int edad3 = sc.nextInt();
            sc.nextLine();
            System.out.println("QUIERES SABER LA LISTA: SI O NO");
            String respuesta = sc.nextLine();
            if (respuesta.equals("si")) {
                System.out.println("LISTA DE ESTUDIANTES:");
                System.out.println("-" + estudiante1 + "-" + edad1);
                System.out.println("-" + estudiante2 + "-" + edad2);
                System.out.println("-" + estudiante3 + "-" + edad3);
            } else if (respuesta.equals("no")) {
                System.out.println("OK");
            } else {
                System.out.println("NO SE ENTIENDE");
            }
        }
    }
}
