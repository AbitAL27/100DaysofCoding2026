import java.util.Scanner;

/**
 * day64
 */
public class day64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = sc.nextInt();
        
        long hasil = 1;

        if (N<0) {
            System.out.println("nilai tidak boleh negatif");
            
        }else if (N>20) {
            System.out.println("hasil terlalu besar untuk tipe data long");
            
        }else {
            for (int i = N; i >=1; i--) {
                hasil *=i;
                System.out.print(i);

                if (i>1) {
                    System.out.print(" * ");
                    
                }
                
            }
            System.out.println(" = "+hasil);
        }
        
        sc.close();

    }
}
