import java.util.Scanner;

/**
 * day15
 */
public class day15 {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasilKali = angka1 * angka2;
        double hasilBagi = angka1 / angka2;

        System.out.println();
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);

        input.close();
        




    }
}
