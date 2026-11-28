public class day88 {

    // Method void non-static
    void cetakProgres() {
        System.out.println("Progres perjalanan menuju Hari ke-100:");
        for (int hari = 88; hari <= 100; hari++) {
            System.out.print("Hari-" + hari + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat objek untuk memanggil method void
        day88 program = new day88();
        program.cetakProgres();
    }
}
