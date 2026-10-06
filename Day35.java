import java.util.Scanner;

/**
 * day35
 */
public class day35 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukan nilai kehadiran :");
        int hadir = sc.nextInt();

        if (tugas>=80) {
            if (hadir>=90) {
                System.out.println("Lulus tanpa syarat");
                
            } else {
                System.out.println("Lulus bersyarat, nilai kehadiran kurang");
            }
            
        }else if (tugas<=80) {
            if (hadir>=90) {
                System.out.println("Lulus bersyarat, nilai tugas kurang");
                
            }else {System.out.println("Tidak lulus, kedua nilai kurang");}
            
        }

        sc.close();


    }
}
