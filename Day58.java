import java.util.Scanner;

public class day58 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = sc.nextInt();

        System.out.println("Bilangan genap dari N ke 1: ");
        for (int i = N; i >=1; i--) {
            if (i%2==0) {
                
                System.out.print(i+" ");  
            }
            
        }

        System.out.println("\nBilangan ganjil dari N ke 1: ");
        for (int i = N; i >=1; i-+) {
            if (i%2!=0) {
                System.out.print(i+" ");
                
            }
            
        }
        sc.close();


    }
    
}
