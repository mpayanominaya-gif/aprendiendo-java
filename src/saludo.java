import java.util.Scanner;
public class saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NOMBRE:");
        String nombre = sc.nextLine();
        saludar(nombre);
    }

    public static void saludar(String nombre) {
        System.out.println("hola "+nombre+"!");
    }
}