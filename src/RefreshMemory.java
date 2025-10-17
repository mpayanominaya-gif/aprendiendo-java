import java.util.Scanner;

public class RefreshMemory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi there, What's your name?....");
        String name = sc.nextLine();
        System.out.println("And..How old are you?..");
        int edad = sc.nextInt();
        if (edad >=18) {
        System.out.println("You  are a adult :D");}
        else  {
            System.out.println("YOU ARE NOT ADULT...");
        }
        System.out.println("Finally...TYSM anyway :3..." + name);

    }
}
