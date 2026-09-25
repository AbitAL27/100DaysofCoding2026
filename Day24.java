import java.util.Scanner;

/**
 * day24
 */
public class day24 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan panjang (cm): ");
        int panjang = sc.nextInt();

        System.out.print("Masukan lebar (cm): ");
        int lebar = sc.nextInt();

        int luas = panjang * lebar;

        System.out.println();

        System.out.println("=== HASIL ===");
        
        System.out.println();

        System.out.println("Luas persegi panjang: " + luas + "cm");

        sc.close();

    }
}
