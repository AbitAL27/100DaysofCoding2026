import java.util.Scanner;

/**
 * day41
 */
public class day41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan suhu ruangan : ");
        int a = sc.nextInt();

        if (a<=18) {
            System.out.println("Suhu dingin");
            
        }else if (a<=25) {
            System.out.println("Suhu normal");
            
        }else if (a<=30) {
            System.out.println("Suhu hangat");
            
        }else {
            System.out.println("Suhu panas");
            
        }
        sc.close();
    }
}
