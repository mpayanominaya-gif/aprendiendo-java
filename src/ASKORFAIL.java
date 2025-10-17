import java.util.Scanner ;

public class ASKORFAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("UN PAIS ES UNA CIUDAD");
        System.out.println("si o no");
        String respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            System.out.println("BIEN :D");
        }else if (respuesta.equals("no")){
            System.out.println("C:\\Windows\\System32");
        } else {
            System.out.println("NO SE ENTIENDE ");
        }
    }
}
