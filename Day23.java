import java.util.Scanner;

/**
 * day23
 */
public class day23 {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan panjang sisi persegi (cm): ");
        double sisi = sc.nextDouble() ;
        double luas = sisi*sisi;

        System.out.println();

        System.out.println("=== HASIL ===");
        System.out.println();

        System.out.println("Sisi persegi: " + sisi + "cm");
        System.out.println("Luas persegi: " + luas + "cm²");


        sc.close();
    }
}
