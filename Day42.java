import java.util.Scanner;

public class day42 {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan total gaji pokok : ");
        double a = sc.nextDouble();

        System.out.print("Masukan gaji lembur : ");
        double b = sc.nextDouble();

        System.out.print("Masukan total potongan : ");
        double c = sc.nextDouble();

        double d = (a+b)-c;

        System.out.println("===DATA GAJI===");

        System.out.printf("Total gaji adalah : Rp%.0f%n",a+b);
        System.out.printf("Total gaji bersih adalah : Rp%.0f%n ",d);

        sc.close();
        


    }
    
}
