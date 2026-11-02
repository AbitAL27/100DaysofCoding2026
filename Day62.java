import java.util.Scanner;

public class day62 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah baris: ");
        int a = sc.nextInt();
        int b = 0;


        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                b++;
                System.out.print("* ");
                
            }
            System.out.println();
        }
        
        System.out.println("\ntotal * adalah: "+b);

        sc.close();
    }
    
}
