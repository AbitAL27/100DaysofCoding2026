import java.util.Scanner;

/**
 * day22
 */
public class day22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai 1: ");
        int a = sc.nextInt();
        System.out.print("Masukan nilai 2: ");
        int b = sc.nextInt();

        System.out.println();

        System.out.println("Sebelum ditukar");
        System.out.println("Nilai 1 sebelum ditukar: " + a);
        System.out.println("Nilai 2 setelah ditukar: " + b);

        //Menukar nilai
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println();

        System.out.println("Setelah ditukar");
        System.out.println("Nilai 1 setelah ditukar: " + a);
        System.out.println("Nilai 2 setelah ditukar: " + b);


        sc.close();
    }
}
