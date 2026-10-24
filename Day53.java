import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        do {
            System.out.print("Masukkan angka positif: ");
            angka = input.nextInt();

            if (angka <= 0) {
                System.out.println("Angka harus lebih besar dari 0!");
            }
        } while (angka <= 0);

        System.out.println("Angka yang kamu masukkan: " + angka);

        input.close();
    }
}
