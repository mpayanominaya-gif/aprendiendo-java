import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-");
        System.out.println("Sell you name for start");
        String name = sc.nextLine();
        String text = sc.nextLine();

        System.out.println(name + ":" + text);
         String text1 = sc.nextLine();
        System.out.println(name + ":" + text1);

        String text2 = sc.nextLine();
        System.out.println(name + ":" + text2);

        String text3 = sc.nextLine();
        System.out.println(name + ":" + text3);
        System.out.println("END 'CHAT'");
    }
}
