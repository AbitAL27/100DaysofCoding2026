import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Operator aritmatika
        int tambah = angka1 + angka2;
        int kurang = angka1 - angka2;
        int kali = angka1 * angka2;
        int sisa = angka1 % angka2;

        // Operator perbandingan
        boolean sama = angka1 == angka2;
        boolean lebihBesar = angka1 > angka2;
        boolean lebihKecil = angka1 < angka2;

        // Operator logika
        boolean kondisiAND = (angka1 > 0) && (angka2 > 0);
        boolean kondisiOR = (angka1 > 10) || (angka2 > 10);
        boolean kondisiNOT = !(angka1 == angka2);

        System.out.println();
        System.out.println("=== HASIL ===");

        System.out.println("Penjumlahan : " + tambah);
        System.out.println("Pengurangan : " + kurang);
        System.out.println("Perkalian   : " + kali);
        System.out.println("Sisa bagi   : " + sisa);

        System.out.println();
        System.out.println("Angka sama        : " + sama);
        System.out.println("Angka pertama > kedua : " + lebihBesar);
        System.out.println("Angka pertama < kedua : " + lebihKecil);

        System.out.println();
        System.out.println("Keduanya positif        : " + kondisiAND);
        System.out.println("Minimal satu > 10       : " + kondisiOR);
        System.out.println("Angka tidak sama        : " + kondisiNOT);

        input.close();
    }
}
