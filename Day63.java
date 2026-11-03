import java.util.Scanner;

public class day63 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai M (bilangan pokok): ");
        int M = sc.nextInt();
        System.out.print("Masukan nilai N (pangkat): ");
        int N = sc.nextInt();
        long hasil=1;

        
        if (N<0) {
            System.out.println("pangkat tidak boleh negatif");
            
        } else {
            for (int i = 1; i <=N; i++) {
                hasil *=M;
                System.out.print(M+"*");
                
            }
        }

        System.out.println(" = "+hasil);

        sc.close();

    }
    
}
