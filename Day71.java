import java.util.Scanner;

public class day71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println("Tinggi harus lebih dari 0!");

        } else {

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i + 1; j++) {

                    System.out.print("*");

                }

                System.out.println();
            }
        }

        sc.close();
    }
}
