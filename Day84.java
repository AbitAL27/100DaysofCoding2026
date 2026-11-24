import java.util.Scanner;

public class day84 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukan jumlah array: ");
        int a = sc.nextInt();
        int nilai [] = new int[a];

        System.out.println("=== INPUT ANGKA ===");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan angka ke-"+(i+1)+": ");
            nilai[i]=sc.nextInt();
            
        }

        int maks = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > maks) {
                maks = nilai[i];
                
            }
            
        }
        System.out.println("\n=== HASIL ===");
        System.out.println("Angka maksimal adalah: "+maks);


        sc.close();

    }
    
}
