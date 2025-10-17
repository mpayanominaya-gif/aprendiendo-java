import java.util.Scanner;

public class CalculadoDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First, Your name is?..");
        String name = sc.nextLine();
        System.out.println("Write any number..."+name);
        int num1 = sc.nextInt();
        System.out.println("Write a second number.."+name);
        int num2 = sc.nextInt();
        System.out.println("Choose a operation + - * /"+name);
        String operacion = sc.next();
        int resultado = 0;

        if (operacion.equals("+")){
            resultado = num1 + num2;
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;

        } else if (operacion.equals("*")) {
            resultado = num1 * num2;

        } else if (operacion.equals("/")) {
            resultado = num1 / num2;

        }else {
            System.out.println("ERROR 54"+name);
        }
        System.out.println("RESULT=" + resultado+ "..." + name);
    }
}
