import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer digito:");
         int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo digito:");
        int num2 = sc.nextInt();
        System.out.println("elige tu operacion + - * /");
        String operacion = sc.next();
        int resultado = 0;

        if (operacion.equals("+")){
            resultado = num1 + num2;
        }else if (operacion.equals("-")){
            resultado = num1 - num2;
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
        } else if (operacion.equals("/")) {
            resultado = num1 / num2; //numero enteros nomas si no sale el error 999
        }else {
            System.out.println("operacion no valida, ERROR999");
        }
        System.out.println("Resultado="+ resultado);
    }
}
