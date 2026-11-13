import java.util.Scanner;

public class day73 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pilihan;

        do {

            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tampilkan Biodata");
            System.out.println("2. Tampilkan Hobi");
            System.out.println("3. Tampilkan Jurusan");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("Nama: Abid");
                    System.out.println("Status: Mahasiswa");
                    break;

                case 2:
                    System.out.println("Hobi: Belajar Coding");
                    break;

                case 3:
                    System.out.println("Jurusan: Teknik Informatika");
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 4);

        sc.close();
    }
}
