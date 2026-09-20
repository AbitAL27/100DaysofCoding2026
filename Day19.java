import java.util.Scanner;

/**
 * day19
 */
public class day19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masuka angka desimal : ");
        double angka = sc.nextDouble();

        int hasil = (int) angka;

        System.out.println("Nilai double \t: " + angka);
        System.out.println("Nilai int \t: " + hasil);
        
        sc.close();

    }
}
