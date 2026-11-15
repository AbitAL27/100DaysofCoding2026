import java.util.Scanner;

public class day75 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namaAsli = "Abid";

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String kata = sc.nextLine();

        System.out.println("\n=== HASIL PENGECEKAN ===");

        // Menggunakan equals()
        System.out.println("Nama sama persis: "
                + nama.equals(namaAsli));

        // Menggunakan equalsIgnoreCase()
        System.out.println("Nama sama tanpa membedakan huruf: "
                + nama.equalsIgnoreCase(namaAsli));

        // Menggunakan contains()
        System.out.println("Mengandung kata yang dicari: "
                + nama.contains(kata));

        // Menggunakan isEmpty()
        System.out.println("Apakah nama kosong: "
                + nama.isEmpty());

        sc.close();
    }
}
