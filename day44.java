import java.util.Scanner;

public class day44 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.print("Masukan nilai ujian : ");

        int a = sc.nextInt();
        if (a<0 || a>100) {
            System.out.println("Nilai tidak valid");
            
        }else if (a>=90) {
            System.out.println("Predikat A");
            
        }else if (a>=80) {
            System.out.println("Predikat B");
            
        }else if (a>=70) {
            System.out.println("Predikat C");
            
        }else if (a>=60) {
            System.out.println("Predikat D");
            
        }else if (a>=50) {
            System.out.println("Predikat E");
            
        }else {
            System.out.println("Nilai anda terlalu rendah");
        }

        sc.close();

    }
    
}
