import java.util.Scanner;

public class dat59 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai M: ");
        int M = sc.nextInt();

        System.out.print("Maukan nilai N: ");
        int N = sc.nextInt();

        System.out.println("Bilangan kelipatan "+M+" dari 1 sampai "+N+ ":");

        if (M<=0||N<1) {
            System.out.println("M harus lebih dari 0 dan N minimal 1.");
            
        }else {
            for (int i = 1; i <=N; i++) {
                if (i%M==0) {
                    System.out.print(i+" ");
                    
                }
                
            }
        }
        sc.close();

    }
    
}
