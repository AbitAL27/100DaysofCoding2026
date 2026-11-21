import java.util.Scanner;

public class day81 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah array: ");
        int jumlah = sc.nextInt();
        int [] nilai = new int [jumlah];

        for (int i = 0; i < nilai.length; i++) {

            System.out.print("Masukan nilai ke- "+(i+1)+": ");
            nilai[i]=sc.nextInt();
            
        }

        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke- "+(i+1)+": "+ nilai[i]);
            
        }
        sc.close();

    }
    
}
