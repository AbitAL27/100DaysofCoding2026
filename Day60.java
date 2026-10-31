import java.util.Scanner;

public class day60 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka N: ");
        int N = sc.nextInt();

        int sum=0;
        
        for (int i = 1; i <=N; i++) {
        
            sum += i;

            System.out.print(i+" ");
            
        }

        System.out.println("\nTotal penjumlahan: "+sum);

        sc.close();
    }
    
}
