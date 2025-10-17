import java.util.Scanner;

public class FAP     {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estudiantes = new String[3];
        int[] edades = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("ingresa el nombre del estudiante" + (i + 1) + ":");
            estudiantes[i] = sc.nextLine();

            System.out.println("ingresa la edad de " + estudiantes[i] + ":");
            edades[i] = sc.nextInt();
            sc.nextLine();
        }
    }
}
