import java.util.Scanner;

public class Preguntas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tu nombre?");
        String nombre = sc.nextLine(); // numeros es int y letras line,en las respuestas

        System.out.println("Tu edad?");
        int edad = sc.nextInt();
        //condicional....


        if (edad >= 18) {
            System.out.println("YA ERES MAYOR....");
        } else {
            System.out.println("NO ERES MAYOR AUN....");
        }
        System.out.println("Hola tu nombre es:" + nombre + " y tu edad es:" + edad );
    }
}