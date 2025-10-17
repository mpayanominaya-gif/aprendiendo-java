import java.util.Scanner;

public class clase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Cual es tu edad?");
        int edad = sc.nextInt();
        System.out.println("Cual es tu ciudad?");
        sc.nextLine();
        String ciudad = sc.nextLine();
        System.out.println("Te gusta programar? (true/false)");
        boolean gusto = sc.nextBoolean();

        System.out.println("Tu nombre es "+nombre+", tienes "+edad);
        System.out.println("Usted vive en "+ciudad);
        System.out.println("Te gusta programar?:"+gusto);

    }
}
