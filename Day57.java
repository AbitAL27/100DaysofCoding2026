import java.util.Scanner;

public class day57 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = sc.nextInt();

        System.out.println("Bilangan genap dari 1 ke N: ");
        for (int i = 1; i <=N; i++) {
            if (i%2==0) {
                
                System.out.print(i+" ");  
            }
            
        }

        System.out.println("\nBilangan ganjil dari 1 ke N: ");
        for (int i = 1; i <=N; i++) {
            if (i%2!=0) {
                System.out.print(i+" ");
                
            }
            
        }
        sc.close();


    }
    
}
