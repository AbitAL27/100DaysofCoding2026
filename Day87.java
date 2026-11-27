
import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[10];
        int jumlah = 5;

        
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;

        int pilihan;

        do {
            System.out.println("\n=== MENU MANIPULASI ARRAY ===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== DATA ARRAY ===");

                    if (jumlah == 0) {
                        System.out.println("Data masih kosong!");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println(
                                "Indeks " + i + " = " + angka[i]
                            );
                        }
                    }
                    break;

                case 2:
                    if (jumlah < angka.length) {
                        System.out.print("Masukkan angka baru: ");
                        angka[jumlah] = sc.nextInt();
                        jumlah++;

                        System.out.println("Data berhasil ditambahkan!");
                    } else {
                        System.out.println("Array sudah penuh!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan indeks yang ingin diubah: ");
                    int indeksUbah = sc.nextInt();

                    if (indeksUbah >= 0 && indeksUbah < jumlah) {
                        System.out.print("Masukkan nilai baru: ");
                        angka[indeksUbah] = sc.nextInt();

                        System.out.println("Data berhasil diubah!");
                    } else {
                        System.out.println("Indeks tidak tersedia!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int indeksHapus = sc.nextInt();

                    if (indeksHapus >= 0 && indeksHapus < jumlah) {

                        for (int i = indeksHapus; i < jumlah - 1; i++) {
                            angka[i] = angka[i + 1];
                        }

                        jumlah--;

                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Indeks tidak tersedia!");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 5);

        sc.close();
    }
}
