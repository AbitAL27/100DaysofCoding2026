import java.util.Scanner;

/**
 * day20
 */
public class day20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka\t\t: ");
        int angka = sc.nextByte();
        System.out.print("Masukan angka desimal\t: ");
        double desimal = sc.nextDouble();
        System.out.print("Masukan charakter\t: ");
        char c = sc.next().charAt(0);
        System.out.print("True of False\t\t: ");
        boolean b = sc.nextBoolean();

        String teksAngka = String.valueOf(angka);
        String teksDesimal = String.valueOf(desimal);
        String teksChar = String.valueOf(c);
        String teksBoolean = String.valueOf(b);

        System.out.println();
        System.out.println("=== ABID GANTENG ===");
        System.out.println();

        System.out.println("Nilai int\t\t: " + angka);
        System.out.println("Nilai String int\t: " + teksAngka);
        System.out.println("Nilai Double\t\t: " + desimal);
        System.out.println("Nilai String Double\t: " + teksDesimal);
        System.out.println("Nilai Char\t\t: " + teksChar);
        System.out.println("Nilai String Char\t: " + teksChar);
        System.out.println("Nilai Boolean\t\t: " + b);
        System.out.println("Nilai String Boolean\t: " + teksBoolean);


        sc.close();
        


    }
}
