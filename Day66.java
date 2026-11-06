import java.util.Scanner;

public class day66 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah garis: ");
        int N = sc.nextInt();

        for (int i =1; i <=N; i++) {
            System.out.print("_");
            
        }
         
        sc.close();

    }
    
}
