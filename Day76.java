import java.util.Scanner;

public class day76 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = sc.nextLine();

        System.out.println("\n=== HASIL MANIPULASI STRING ===");

        // Menggunakan trim()
        String namaTrim = nama.trim();

        System.out.println("Nama setelah trim: " + namaTrim);

        // Menggunakan substring()
        if (namaTrim.length() >= 3) {
            System.out.println("Tiga karakter pertama: "
                    + namaTrim.substring(0, 3));
        } else {
            System.out.println("Nama terlalu pendek untuk substring.");
        }

        // Menggunakan replace()
        System.out.println("Nama setelah replace: "
                + namaTrim.replace("a", "o"));

        sc.close();
    }
}
