import java.util.Scanner;

public class day52 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka mundur dari: ");
        int a = sc.nextInt();

        while (a>=1) {
            System.out.println(a);
            a--;
            
        }
        System.out.println("Selesai");

        
        sc.close();


    }
    
}
