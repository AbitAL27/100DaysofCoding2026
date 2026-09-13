import java.util.Scanner;

/**
 * day12
 */
public class day12 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama:   ");
        String nama = input.nextLine();
        
        System.out.println("Alamat Anda:    ");
        String alamat = input.nextLine();

        System.out.println("Umur Anda:  ");
        int umur = input.nextInt();

        System.out.println("Masukan Tinggi Anda:    ");
        double tinggi = input.nextDouble();

        System.out.println();
        System.out.println("==== BIO DATA ====");
        System.out.println("Nama    :" + nama);
        System.out.println("Alamat  :" + alamat);
        System.out.println("Umur    :" + umur);
        System.out.println("Tinggi  :" + tinggi);

        input.close();

    }
}
