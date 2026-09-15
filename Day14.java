import java.util.Scanner;

/**
 * day14
 */
public class day14 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("MASUKAN ANGKA 1:");
        int angka1 = input.nextInt();

        System.out.println("MASUKAN ANGKA 2:");
        int angka2 = input.nextInt();
        
        int hasilKurang = angka1-angka2;
        int hasilTambah = angka1+angka2;

        System.out.println("HASIL PENAMBAHAN:" + hasilTambah);
        System.out.println("HASIL PENGURANGAN:" + hasilKurang);


        input.close();






    }
}
