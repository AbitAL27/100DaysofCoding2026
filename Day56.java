import java.util.Scanner;

public class day56 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("MASUKA NILAI N: ");
        int N = sc.nextInt();
        System.out.println("ANGKA DARI 1 KE-N,"+" N adalah: "+N);
        for (int i = 1; i <=N; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\nANGKA DARI N KE-1, N adalah: "+N);
       for (int i = N; i >=1; i--) {
           System.out.print(i+" ");
            
        }

        sc.close();
    }
    
}
