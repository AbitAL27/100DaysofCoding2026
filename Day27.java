import java.util.Scanner;

/**
 * day27
 */
public class day27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int a = sc.nextInt();

        System.out.println("Hasil post increment: " + a++);
        System.out.println("Nilai setelah increment: " + a);
        System.out.println("Hasil pre increment: " + (++a));
        System.out.println("Nilai setelah increment: " + a );
        System.out.println("Hasil post decrement: " + a--);
        System.out.println("Nilai setelah decrement: " + a);
        System.out.println("Hasil pre decrement: " + (--a));
        System.out.println("Nilai setelah decrement: " + a );

        sc.close();

     

    }
}
