import java.util.Scanner;

public class evalday40 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long totalWarisan = sc.nextLong();
        long admin = totalWarisan/10;
        long bersih = totalWarisan-admin;
        long pembagian = bersih/6;

        System.out.println("ARIEL: " + pembagian*2);
        System.out.println("JEFRI: " + pembagian*2);
        System.out.println("MARSYA: " + pembagian);
        System.out.println("LIANA: " + pembagian);

        sc.close();





    }
    
}
