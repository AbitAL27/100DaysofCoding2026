import java.util.Scanner;

public class day67 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan ukuran persegi: ");
        int N = sc.nextInt();

        if (N<=0) {
            System.out.println("Ukuran harus lebih dari 0!");
            
        }else {
            for (int i = 1; i <=N; i++) {
                for (int j = 1; j<=N; j++) {
                    System.out.print("_");
                    
                }
                System.out.println();
            }
        }


        sc.close();

    }
    
}
