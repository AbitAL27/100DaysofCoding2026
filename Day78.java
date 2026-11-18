
import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data akun
        String usernameBenar = "admin";
        String passwordBenar = "12345";

        String username;
        String password;

        System.out.println("===== LOGIN AKUN =====");

        while (true) {
            System.out.print("Masukkan Username: ");
            username = sc.nextLine();

            System.out.print("Masukkan Password: ");
            password = sc.nextLine();

            // Pengecekan username dan password
            if (username.equals(usernameBenar) &&
                password.equals(passwordBenar)) {

                System.out.println("\nLogin Berhasil!");
                System.out.println("Selamat datang, " + username);
                break;

            } else {
                System.out.println("\nUsername atau Password salah!");
                System.out.println("Silakan coba lagi.\n");
            }
        }

        sc.close();
    }
}
