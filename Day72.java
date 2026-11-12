import java.util.Scanner;

public class day72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("=== PROGRAM PENJUMLAHAN ===");

        System.out.println("Masukkan angka negatif untuk berhenti.");

        while (true) {

            System.out.print("Masukkan angka: ");
            angka = sc.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;
        }

        System.out.println("------------------------");
        System.out.println("Total penjumlahan: " + total);

        sc.close();
    }
}
