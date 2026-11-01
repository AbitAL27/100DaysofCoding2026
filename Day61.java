import java.util.Scanner;

public class day61 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = sc.nextInt();

        long hasil = 1;

        if (N<1) {
            System.out.println("Nilai harus lebih atau sama dengan 1");
            
        } else {
            for (int i = 1; i<=N; i++) {
                hasil *= i;
                
            }
            System.out.println("Hasil perkalian: "+hasil);
        }

        

        sc.close();
    }
    
}
