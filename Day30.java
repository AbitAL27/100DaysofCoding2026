import java.util.Scanner;

/**
 * day30
 */
public class day30 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int a = sc.nextInt();

        System.out.print("Masukan angka kedua : ");
        int b = sc.nextInt();

        System.out.println("Apakah angka pertama >= ?: " + (a >= b));
        System.out.println("Apakah angka pertama <= ?: " + (a <= b));

        sc.close();



    }
}
