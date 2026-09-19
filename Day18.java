import java.util.Scanner;

/**
 * day18
 */
public class day18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka 1-127: ");
        byte a = sc.nextByte();
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("Hasil byte\t: " + a);
        System.out.println("Hasil short\t: " + b);
        System.out.println("Hasil int\t: " + c);
        System.out.println("Hasil long\t: " + d);
        System.out.println("Hasil float\t: " + e);
        System.out.println("Hasil double\t: " + f);

        sc.close();

    }
}
