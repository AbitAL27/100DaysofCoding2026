import java.util.Scanner;

/**
 * day31
 */
public class day31 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukan angka kedua : ");
        int b = sc.nextInt();
        System.out.print("Masukan angka ketiga : ");
        int c = sc.nextInt();
        
        boolean d = a>c && b>c;
        boolean e = a>c || b>c;

        System.out.println();

        System.out.println("Apakah nilai pertama dan kedua\nlebih besar dari nilai ketiga \t: " + d);
        System.out.println();
        System.out.println("Minimal salah satu nilai lebih\nbesar dari nilai ketiga \t: " + e);
        System.out.println();
        System.out.println("Nilai NOT && \t: " + !d);
        System.out.println("Nilai NOT || \t: " + !e);
        





    }
}
