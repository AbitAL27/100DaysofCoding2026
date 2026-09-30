import java.util.Scanner;

/**
 * day29
 */
public class day29 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka 1 : ");
        int a = sc.nextInt();
        System.out.print("Masukan angka 2 : ");
        int b = sc.nextInt();
        
    
        System.out.println("Apakah angka 1 lebih besar dari angka 2? : " + (a > b));
        System.out.println("Apakah angka 1 lebih kecil dari angka 2? : " + (a < b));

        sc.close();


    }
}
