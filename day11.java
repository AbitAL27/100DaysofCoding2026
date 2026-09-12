import java.util.Scanner;

/**
 * day11
 */
public class day11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        System.out.println();
        System.out.println("=== DATA ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Tinggi : " + tinggi + " cm");

        input.close();
        



    }
}
