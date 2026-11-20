import java.util.Scanner;

public class day80 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilai [] = {10, 20, 30, 40, 50};

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("indeks "+i+" = "+ nilai[i]);
            
        }

        System.out.print("\nMasukan indeks yang ingin di akses: ");
        int indeks = sc.nextInt();

        if (indeks>0 && indeks < nilai.length) {
            System.out.println("Nilai pada indeks "+indeks+" adalah "+ nilai[indeks]);
            
        }else {
            System.out.println("indeks tidak valid");
        }

        sc.close();

    }
    
}
