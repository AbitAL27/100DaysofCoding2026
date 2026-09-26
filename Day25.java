import java.util.Scanner;

/**
 * day25
 */
public class day25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jari-jari lingkaran (cm): ");
        double jari = sc.nextDouble();
        double luas = Math.PI*jari*jari;

        System.out.println();

        System.out.printf("Luas lingkaran = %.2f cm²", luas);

        sc.close();

    }
}
