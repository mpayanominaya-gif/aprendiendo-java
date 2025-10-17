import java.util.Scanner;
public class sumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QUE NUMERO SUMAR");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("+");
        int b = sc.nextInt();
        int resultado = a + b;
        System.out.println("="+resultado);
    }
}
