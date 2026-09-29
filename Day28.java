import java.util.Scanner;

/**
 * day28
 */
public class day28 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int a = sc.nextInt();

        System.out.print("Masukan angka kedua : ");
        int b = sc.nextInt();

        System.out.println("Apakah angka sama? : " + (a==b));
        System.out.println("Apakah angka tidak sama? : " + (a!=b));

        sc.close();



    }

    
}
