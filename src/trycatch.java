import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean digitoCorrecto =false;
        while (!digitoCorrecto)
        try {
            System.out.println("DIGITA UN NUMERO:");
            int numeroIngresado = sc.nextInt();
            digitoCorrecto=true;
        } catch (InputMismatchException e) {
            System.out.println("NUMERO INVALIDO");
            sc.nextLine();
        }
        System.out.println("DIGITASTE UN NUMERO✅");
        sc.close();
    }
}
