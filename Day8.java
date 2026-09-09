/**
 * day8
 */
public class day8 {

    public static void main(String[] args) {
         // Deklarasi
        int stok;
        double harga;
        String status;

        // Inisialisasi
        stok = 100;
        harga = 15000.0;
        status = "Tersedia";

        System.out.println("=== DATA BARANG ===");
        System.out.println("Stok   : " + stok);
        System.out.println("Harga  : Rp" + harga);
        System.out.println("Status : " + status);

        // Update variable
        stok = stok - 5 ;
        harga = 14000.0;
        status = "Promo";

        System.out.println("\n=== SETELAH UPDATE ===");
        System.out.println("Stok   : " + stok);
        System.out.println("Harga  : Rp" + harga);
        System.out.println("Status : " + status);
    }
}
